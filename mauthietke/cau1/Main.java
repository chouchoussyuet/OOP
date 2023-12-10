package mauthietke.cau1;

public class Main {
    public static void main(String[] args) {
        // Tạo một người và kiểm tra các thuộc tính của họ
        Person person = new Person("HaLinh", "01/01/1990", "Male", "Married");
        System.out.println("Name: " + person.getFullName());
        System.out.println("Date of Birth: " + person.getDateOfBirth());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Marital Status: " + person.getMaritalStatus());

        // Thêm một đứa con và kiểm tra danh sách con cái
        Person child = new Person("HoaMai", "15/02/2015", "Female", null);
        person.addChild(child);
        System.out.println("Children:");
        for (Person childPerson : person.getChildren()) {
            System.out.println("\tName: " + childPerson.getFullName());
        }
    }
}
