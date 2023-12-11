package mauthietke.cau2;


public class SortContext {
    private SortingStrategy strategy;

    public void setSortingStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array, boolean ascending) {
        if (strategy != null) {
            strategy.sort(array, ascending);
        }
    }
}

