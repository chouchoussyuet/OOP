package mauthietke.cau2;

import java.util.List;

public class Context {
    private SortingStrategy sortingStrategy;

    /**
     * Constructor. 
     * 
     * @param sortingStrategy this.
     */
    public Context(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    /**
     * Setter. 
     * 
     * @param sortingStrategy this.
     */
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    /**
     * Getter. 
     * 
     * @param list this.
     */
    public void performSort(List<Integer> list) {
        sortingStrategy.sort(list);
    }
}
