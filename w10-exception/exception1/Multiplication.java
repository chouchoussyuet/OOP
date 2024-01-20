public class Multiplication extends BinaryExpression {
    /**
     * Constructor. 
     * @param left this.
     * @param right this.
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override 
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}