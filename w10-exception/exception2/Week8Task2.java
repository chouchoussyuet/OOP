import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    /**
     * Null Pointer. 
     * 
     * @throws NullPointerException ex.
     */
    public void nullPointerEx() throws NullPointerException {
        String str = null;
        System.out.println(str.length());
    }

    /**
     * Null pointer test. 
     * 
     * @return result. 
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * Array ex.
     * 
     * @throws ArrayIndexOutOfBoundsException ex. 
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[2];
        arr[0] = 0;
        arr[1] = 0;
        
        System.out.println(arr[3]);
    }

    /**
     * Test arr. 
     * 
     * @return res. 
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * Arth. 
     * 
     * @throws ArithmeticException ex. 
     */
    public void arithmeticEx() throws ArithmeticException {
        int n = 10 / 0;
    }

    /**
     * Test arh. 
     * 
     * @return res. 
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }

        return "Không có lỗi";
    }

    /**
     * File ex. 
     * 
     * @throws FileNotFoundException ex. 
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        FileInputStream fs = new FileInputStream("D:\\u\\h.docx");
    }

    /**
     * Test file. 
     * 
     * @return res. 
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }

        return "Không có lỗi";
    }

    public void ioEx() throws IOException {
        FileInputStream fs = new FileInputStream("D:\\u\\h.docx");
    }

    /**
     * Test io. 
     * 
     * @return res. 
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }

        return "Không có lỗi";
    }
}