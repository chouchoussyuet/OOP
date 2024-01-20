import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * Constructor. 
     * 
     * @param name this.
     * @param address this.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<>();
    }

    /**
     * Add vehicle to list.
     * 
     * @param vehicle this. 
     */
    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    /**
     * Getter for name.
     * 
     * @return this. 
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * 
     * @param name this.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for address. 
     * 
     * @return this.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter for address. 
     * 
     * @param address this.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Remove vehicle to the list. 
     * 
     * @param registrationNumber index. 
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle v : vehicleList) {
            if (v.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(v);
            }
        }
    }

    /**
     * Get the vehicle info from the list. 
     * 
     * @return vihicle. 
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        }

        String s = name + " has:\n\n";

        for (Vehicle v : vehicleList) {
            s = s + v.getInfo();
        }
        
        return s;
    }


}
