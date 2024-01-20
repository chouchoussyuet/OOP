public class Student {
    // Khai bao cac thuoc tinh cho Student:
    private String name;
    private String id;
    private String group;
    private String email;

    // khai bao cac getter, setter

    /**
     * Getters.
     */
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Setter.
     */
    public void setName(String name) {
        this.name = name;
    } 

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Constructor 1.
     */
    Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     * 
     * @param name : name.
     * @param id : studentid.
     * @param email : email.
     */
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Constructor 3.
     * 
     * @param s : student s.
     */
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Get information.
     */
    String getInfo() {
        String info = name + " - " + id + " - " + group + " - " + email;
        return info;
    }

}