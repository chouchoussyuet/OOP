import java.util.Scanner;

public class Solution {
    /**
     * Boolean prime.
     * 
     * @param n : int.
     * @return true or false.
     */
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Main.
     * 
     * @param args : String main.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();

        Solution solution = new Solution();
        boolean prime = solution.isPrime(a);
        System.out.println(prime);

        sc.close();
    }
}