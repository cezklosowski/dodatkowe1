public class SelectionSort {
    private int[] tab;
    private boolean ifIncreasing;

    public SelectionSort(int[] tab, boolean ifIncreasing) {
        this.tab = tab;
        this.ifIncreasing = ifIncreasing;
    }

    public int[] selectionSort() {
        // na razie nie działa, nie wiem czemu
        int temp;
        for (int j = 0; j < tab.length; j++) {
            int indexOfMinimum = j;
            for (int i = j+1; i < tab.length; i++) {
                if (tab[j] > tab[i]) {
                    indexOfMinimum = i;
                }
            }
            temp = tab[j];
            tab[j] = tab[indexOfMinimum];
            tab[indexOfMinimum] = temp;
        }
        return tab;
    }
}
