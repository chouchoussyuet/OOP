package mauthietke.cau2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 7, 8, 3, 6, 0, 9, 5, 4));
        // Chọn thuật toán sắp xếp.
        // Chọn BubbleSort hoặc SelectionSort.
        SortingStrategy sortingStrategy = new SelectionSort();
        
        Context context = new Context(sortingStrategy);
        context.performSort(list);
        
        System.out.println("Sorted List: " + list);
    }
}
