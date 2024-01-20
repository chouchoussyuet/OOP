public class Person {
    private String name;
    private String address;
    
    /**
     * Constructor. 
     * 
     * @param name : string.
     * @param address : string.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Getter for name.
     * 
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name.
     * 
     * @param name : new.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for address.
     * 
     * @return address.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for address.
     *  
     * @param address : new.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * To String.
     */
    public String toString() {
        String s = "Person[name=" + this.name 
                    + ",address=" + this.address + "]";
        return s;
    }
}