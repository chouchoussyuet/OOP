import java.util.List;

public class Week11 {
    /**
     * Generic method. 
     * 
     * @param <T> generic type.
     * @param list this. 
     * @return list. 
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    T tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }

        return list;
    }
}