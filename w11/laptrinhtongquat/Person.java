public class Person implements Comparable<Person> {

    protected String name;
    protected int age;
    protected String address;

    /** Constructor mac dinh. */
    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    /**
     * Constructor. 
     * 
     * @param name this. 
     * @param age this. 
     * @param address this. 
     */
    public Person(String name, int age, String address) {
        this.name = name; 
        this.age = age;
        this.address = address;
    }

    /**
     * Getter name.
     * 
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter name. 
     * 
     * @param name this. 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter age. 
     * @return age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter age. 
     * 
     * @param age this.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter ad.
     * 
     * @return ad.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter ad. 
     * 
     * @param address this.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Override.
     * 
     * @param p this. 
     * @return int.
     */
    
    public int compareTo(Person p) {
        int nameComparison = this.name.compareTo(p.name);

        // if do not same name
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.age, p.age);
        }
    }
}
