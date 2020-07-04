import java.util.Comparator;

class BinarySearch<E> implements Comparator {
    private E searched;
    private E[] tab;

    public BinarySearch(E searched, E[] tab) {
        this.searched = searched;
        this.tab = tab;
    }

    public int binarySearch() throws Exception {
        int low = 0;
        int high = tab.length - 1;
        int mid;
        while (low <= high) {
            mid = (high + low) / 2;
            if (compare(tab[mid], searched) == 0) return mid;
            else {
                if (compare(tab[mid], searched) < 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        throw new Exception("Szukany element nie występuje w tablicy");
    }

    @Override
    public int compare(Object o, Object t1) {
        return (int)o - (int) t1;
    }
}
