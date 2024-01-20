public class Week4 {
    /**
     *  Calculate max of 2 number.
     * 
     * @param a : first number.
     * @param b : second number.
     * @return max of $a and $b 
     */
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        if (a > b) {
            return a;
        } 

        return b;
    }

    /**
     * Min of array.
     * 
     * @param array : int arr.
     * @return min of array.
     */
    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
    
    /**
     * Calculate BMI.
     * 
     * @param weight : kg
     * @param height : m 
     * @return caclulate BMI.
     */
     public static String calculateBMI(double weight, double height) {
        // Tinh BMI
        double bmi = weight / (height * height);
        bmi = Math.round(bmi*10)/10.0;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi >= 18.5 && bmi < 23) {
            return "Bình thường";
        } else if (bmi >= 23 && bmi < 25) {
            return "Thừa cân";
        } else if (bmi >= 25) {
            return "Béo phì";
        }

        return "";
    }
}