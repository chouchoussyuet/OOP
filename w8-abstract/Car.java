public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor. 
     * 
     * @param brand this.
     * @param model this. 
     * @param registrationNumber this.
     * @param owner this.
     * @param numberOfDoors this.
     */
    public Car(String brand, String model, String registrationNumber, 
                Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Getter. 
     * 
     * @return noOfDoors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    
    /**
     * Setter.
     * 
     * @param numberOfDoors this.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Get info for car.
     */
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + this.getBrand() + "\n"
                + "\tModel: " + this.getModel() + "\n"
                + "\tRegistration Number: " + this.getRegistrationNumber() 
                + "\n" + "\tNumber of Doors: " + this.numberOfDoors + "\n"
                + "\tBelongs to " + this.owner.getName() 
                + " - " + this.owner.getAddress() + "\n";
    }
}


































