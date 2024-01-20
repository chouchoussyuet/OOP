public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * Constructor. 
     * 
     * @param left this. 
     * @param right this. 
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}