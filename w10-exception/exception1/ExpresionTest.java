public class ExpresionTest {

    /**
     * Main method. 
     * 
     * @param args str.
     */
    public static void main(String[] args) {
        // Numeral a = new Numeral(10);
        // Square a2 = new Square(a); 
        // Numeral b = new Numeral(3);
        // Subtraction s = new Subtraction(a2, b);

        // Numeral c = new Numeral(4);
        // Multiplication m = new Multiplication(c, b);

        // Addition d = new Addition(s, m);
        // Square d2 = new Square(d);

        // System.out.println(d2.evaluate());
        Numeral x = new Numeral(3);
        Numeral y = new Numeral(2);
        Numeral z = new Numeral(2);

        Multiplication r1 = new Multiplication(y, z);
        Multiplication r2 = new Multiplication(r1, x);

        Multiplication r3 = new Multiplication(r1, z);

        Addition p = new Addition(r2, r3);

        Square s = new Square(x);
        Multiplication sr = new Multiplication(s, x);

        Subtraction res = new Subtraction(p, sr);

        System.out.println(res.evaluate());
    }
    
}
