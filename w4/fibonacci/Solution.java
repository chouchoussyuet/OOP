import java.util.Scanner;

public class Solution {
    /**
     * Fibonacci calculate.
     * 
     * @param n : index. 
     * @return number of index n.
     */
    public static long fibonacci(long n) {
        long f0 = 0;
        long f1 = 1;

        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        for (int i = 1; i < n; i++) {
            long tmp = f1;
            f1 += f0;
            f0 = tmp;

            if (f1 > Long.MAX_VALUE || f1 < 0) {
                return Long.MAX_VALUE;
            }
        }
        return f1;
    }

    /**
     * Main.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        Solution solution = new Solution();
        long f = solution.fibonacci(n);
        System.out.println(f);

        sc.close();
    }
}