package mauthietke.cau2;

import java.util.List;

public class SelectionSort implements SortingStrategy {
    @Override
    public void sort(List<Integer> list) {
        System.out.print("Sort using Selection Sort: ");
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                // Swap list[i] and list[minIndex]
                int temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
