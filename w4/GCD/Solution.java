import java.util.Scanner;

public class Solution {
    /**
     * Calculate gcd of a and b.
     * 
     * @param a : num 1.
     * @param b : num2. 
     * @return gcd of a and b.
     */
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    /**
     * Main.
     * 
     * @param args : String main.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution solution = new Solution();
        int gcdCal = solution.gcd(a, b);

        System.out.println(gcdCal);

        sc.close();
    }
}