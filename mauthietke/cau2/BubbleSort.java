package mauthietke.cau2;

import java.util.List;

public class BubbleSort implements SortingStrategy {
    /**
     * Bubble Sort.
     */
    @Override
    public void sort(List<Integer> list) {
        System.out.print("Sort using Bubble Sort: ");
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // swap list[j] and list[j+1]
                    int tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
