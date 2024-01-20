public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Constructor. 
     * 
     * @param brand this.
     * @param model this. 
     * @param registrationNumber this.
     * @param owner this.
     * @param hasSidecar yes or no. 
     */
    public MotorBike(String brand, String model, 
                String registrationNumber, Person owner, 
                boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Getter. 
     * 
     * @return bool.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * Setter. 
     * 
     * @param hasSidecar this.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    /**
     * Get info for motorbike.
     */
    public String getInfo() {

        return "Motor Bike:\n"
                + "\tBrand: " + this.getBrand() + "\n"
                + "\tModel: " + this.getModel() + "\n"
                + "\tRegistration Number: " + this.getRegistrationNumber() + "\n"
                + "\tHas Side Car: " + this.hasSidecar + "\n"
                + "\tBelongs to " + this.owner.getName() 
                + " - " + this.owner.getAddress() + "\n";
        
    }

}
