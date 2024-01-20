public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Getter numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Getter denominator.
     */
    public int getDenominator() {
        return denominator;
    }


    /**
     * Setter numerator.
     * 
     * @param numerator : use this.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Setter denominator.
     * 
     * @param denominator : use this.
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }


    /**
     * Constructor co tham so.
     */
    Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;     
        } else {
            this.denominator = denominator;
        }
    }

    /**
     * Constructor mặc định.
     */
    Solution() {
        this.numerator = 1;
        this.denominator = 1;
    }


    /**
     * Calculate gcd of a and b.
     * 
     * @param a : num 1.
     * @param b : num2. 
     * @return gcd of a and b.
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


    /**
     * Rút gọn phân số.
     */
    public Solution reduce() {
        int gcdOfab = gcd(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / gcdOfab);
        this.setDenominator(this.getDenominator() / gcdOfab);
       
        return this;
    }


    /**
     * Add two solution.
     * 
     * @param s : other solution.
     * @return new solution is result.
     */
    public Solution add(Solution s) {
        s.reduce();
        Solution res = new Solution();
        int a = this.getNumerator() * s.getDenominator();
        res.setNumerator(a + this.getDenominator() * s.getNumerator());
        res.setDenominator(this.getDenominator() * s.getDenominator());
        res.reduce();

        return res;
    }

    /**
     * Subtract two Solution.
     * @param s : other Solution.
     * @return result.
     */
    public Solution subtract(Solution s) {
        s.reduce();
        Solution res = new Solution();
        int a = this.getNumerator() * s.getDenominator();
        res.setNumerator(a - this.getDenominator() * s.getNumerator());
        res.setDenominator(this.getDenominator() * s.getDenominator());
        res.reduce();

        return res;
    }

    /**
     * Mulitply two solution.
     * 
     * @param s : other.
     * @return : result.
     */
    public Solution multiply(Solution s) {
        s.reduce();
        Solution res = new Solution();
        res.setNumerator(this.getNumerator() * s.getNumerator());
        res.setDenominator(this.getDenominator() * s.getDenominator());
        res.reduce();

        return res;
    }

    /**
     * Divide two Solution.
     * 
     * @param s other Solution.
     * @return result.
     */
    public Solution divide(Solution s) {
        s.reduce();
        Solution res = new Solution();
        res.setNumerator(this.getNumerator() * s.getDenominator());
        res.setDenominator(this.getDenominator() * s.getNumerator());
        res.reduce();

        return res;
    }

    /**
     * Boolean to check.
     * 
     * @param obj : other object.
     * @return true if obj is Solution end equal.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            other.reduce();
            this.reduce();
            if (other.getNumerator() == this.getNumerator()) {
                return other.getDenominator() == this.getDenominator();
            }
        }
        return false;
    }
}