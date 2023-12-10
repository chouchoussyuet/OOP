package mauthietke.cau1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String maritalStatus;
    private List<Person> children;

    /**
     * Constructor. 
     * 
     * @param fullName this. 
     * @param dateOfBirth this.
     * @param gender this.
     * @param maritalStatus this.
     */
    public Person(String fullName, String dateOfBirth, String gender, String maritalStatus) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.children = new ArrayList<>();
    }

    /**
     * Add child. 
     * 
     * @param child this.
     */
    public void addChild(Person child) {
        children.add(child);
    }

    /**
     * Get full name. 
     * 
     * @return this.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Get date of birth. 
     * 
     * @return this. 
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Get gender. 
     * 
     * @return this. 
     */
    public String getGender() {
        return gender;
    }

    /**
     * Get marital status. 
     * 
     * @return this.
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Get childern. 
     * 
     * @return this.
     */
    public List<Person> getChildren() {
        return children;
    }

    /**
     * To String. 
     */
    @Override
    public String toString() {
        return "Full Name: " + fullName + ", Date of Birth: " + dateOfBirth + ", Gender: " + gender + ", Marital Status: " + maritalStatus;
    }

}
