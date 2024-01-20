public class Numeral extends Expression {
    private double value;

    /**
     * Constructor default. 
     */
    public Numeral() {
        this.value = 0;
    }

    /**
     * Constructor. 
     * 
     * @param value this. 
     */
    public Numeral(double value) {
        this.value = value;
    }

    @Override 
    public String toString() {
        return String.format("%.0f", value);
    }

    @Override 
    public double evaluate() {
        return value;
    }
}
