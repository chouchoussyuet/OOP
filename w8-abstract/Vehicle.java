abstract class Vehicle {

    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Constructor.
     * 
     * @param brand this.
     * @param model this. 
     * @param registrationNumber this.
     * @param owner this.
     */
    public Vehicle(String brand, String model, 
                   String registrationNumber, Person owner) {
        this.brand  = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Abstract method.
     * 
     * @return no. 
     */
    abstract String getInfo();

    /**
     * Transfer. 
     * 
     * @param newOwer this.
     */
    public void transferOwnership(Person newOwer) {
        this.owner = newOwer;
    }

    /**
     * Getter. 
     * 
     * @return brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Setter for brand.
     * 
     * @param brand this.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Getter. 
     * 
     * @return model.
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter. 
     * 
     * @param model this.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter. 
     * 
     * @return rgs
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Setter. 
     * 
     * @param registrationNumber this.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Getter. 
     * 
     * @return owner.
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Setter. 
     * 
     * @param owner this.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}