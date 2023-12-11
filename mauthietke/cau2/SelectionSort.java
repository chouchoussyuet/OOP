package mauthietke.cau2;


public class SelectionSort implements SortingStrategy {
    @Override
    public void sort(int[] array, boolean ascending) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int extremeIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (ascending ? array[j] < array[extremeIndex] : array[j] > array[extremeIndex]) {
                    extremeIndex = j;
                }
            }
            // Swap array[i] and array[extremeIndex]
            int temp = array[i];
            array[i] = array[extremeIndex];
            array[extremeIndex] = temp;
        }
    }
}
