public class StudentManagement {
    // khai bao thuoc tinh students la array 
    private Student[] students = new Student[100];
    private int studentCount = 0;

    // Hàm kiểm tra 2 sinh viên có cùng 1 lớp không
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup()); 
    }

    /**
     * Add Student.
     * 
     * @param newStudent : create new.
     */
    public void addStudent(Student newStudent) {
        // kiểm tra nếu độ dài không vượt quá 100
        if (studentCount <= 100) {
            students[studentCount] = new Student(newStudent);
            studentCount++;
        }
    }

    /**
     * Group students.
     */
    public String studentsByGroup() {
       if (students[0] == null) {
            return "";
       }

        String res = "";
        int[] arr = new int[studentCount];
        for (int i = 0; i < studentCount; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < studentCount - 1; i++) {
            if (arr[i] == 0) {
                String currentGroup = students[i].getGroup();
                res += currentGroup + "\n";
                res += students[i].getInfo() + "\n";

                for (int j = i + 1; j < studentCount; j++) {
                    if (students[j].getGroup().equals(currentGroup)) {
                        res += students[j].getInfo() + "\n";
                        arr[j]++;
                    }
                }
            }
        }

        return res;
    }

    
    /**
     * Remove student by id.
     * 
     * @param id : studentid
     */
    public void removeStudent(String id) {
        if (students[0] == null || studentCount == 0) {
            return;
        }
        // kiểm tra 2 xâu giống nhau không 
        for (int i = 0; i < studentCount - 1; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;
            }
        }
    }

    /**
     * Main.
     */
    public static void main(String[] args) {
        
        // Sinh viên 1 khởi tạo theo constructor 1 
        Student student1 = new Student();
        student1.setGroup("K67TCLC");
        
        // Khởi tạo một đối tượng management
        StudentManagement management = new StudentManagement();
        management.addStudent(student1);

        //Sinh viên 2 khởi tạo theo constructor 2 
        Student student2 = new Student("Nguyen Van A", "22024505", "22024505@vnu.edu.vn");
        management.addStudent(student2);
        
        Student student3 = new Student("Nguyen Van B", "22024506", "22024506@vnu.edu.edu.vn");
        management.addStudent(student3);
        
        Student student4 = new Student("Nguyen Van C", "22024507", "22024507@vnu.edu.vn");
        management.addStudent(student4);
        student4.setGroup("K66R");
        
        Student student5 = new Student("Nguyen Van D", "22024508", "22024508@vnu.edu.vn");
        management.addStudent(student5);
        student5.setGroup("K67TCLC");

        System.out.println(management.studentsByGroup());

    }
}


