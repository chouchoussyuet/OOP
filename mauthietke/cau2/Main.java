package mauthietke.cau2;


public class Main {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        SortContext context = new SortContext();

        // Sử dụng Bubble Sort
        context.setSortingStrategy(new BubbleSort());
        context.sortArray(array, true);

        // Sử dụng Selection Sort
        context.setSortingStrategy(new SelectionSort());
        context.sortArray(array, false);

        // Để thêm thuật toán sắp xếp mới, chỉ cần tạo một lớp mới thực thi SortingStrategy.
    }
}

