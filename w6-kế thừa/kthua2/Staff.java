public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor.
     * 
     * @param name : this.
     * @param address this.
     * @param school this.
     * @param pay this.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Getter school.
     * 
     * @return school.
     */
    public String getSchool() {
        return this.school;
    }

    /**
     * Setter school.
     * 
     * @param school this.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Getter pay.
     * 
     * @return pay.
     */
    public double getPay() {
        return this.pay;
    }

    /**
     * Setter pay.
     * 
     * @param pay this.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * To String.
     */
    @Override 
    public String toString() {
        String s = "Staff[Person[name=" + this.getName()
                    + ",address=" + this.getAddress()
                    + "],school=" + this.school
                    + ",pay=" + this.pay + "]";
        return s;
    }
}
