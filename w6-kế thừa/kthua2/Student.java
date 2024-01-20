public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor. 
     * 
     * @param name super.
     * @param address super.
     * @param program this.
     * @param year this.
     * @param fee this.
     */
    Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    
    /**
     * Getter program.
     * 
     * @return program.
     */
    public String getProgram() {
        return this.program;
    }

    /**
     * Setter program.
     * 
     * @param program this.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Getter year.
     * 
     * @return year.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Setter year.
     * 
     * @param year this.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter fee.
     * 
     * @return fee.
     */
    public double getFee() {
        return this.fee;
    }

    /**
     * Setter fee.
     * 
     * @param fee this.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * To String.
     */
    @Override
    public String toString() {
        String s = "Student[Person[name=" + this.getName()
                    + ",address=" + this.getAddress()
                    + "],program=" + this.program
                    + ",year=" + this.year
                    + ",fee=" + this.fee + "]";
        return s;
    }
}
