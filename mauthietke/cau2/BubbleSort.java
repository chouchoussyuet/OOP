package mauthietke.cau2;

public class BubbleSort implements SortingStrategy {
    /**
     * Bubble Sort.
     */
    @Override
    public void sort(int[] array, boolean ascending) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascending ? array[j] > array[j + 1] : array[j] < array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
