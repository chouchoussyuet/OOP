public class Division extends BinaryExpression {
    /**
     * Constructor. 
     * @param left this.
     * @param right this.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override 
    public String toString() {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            return "(" + left.toString() + " / " + right.toString() + ")";
        }
    }

    @Override
    public double evaluate() {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            return left.evaluate() / right.evaluate();
        }
    }
    
}
