public class SelectionSort {
    private int[] tab;
    private boolean ifIncreasing;

    public SelectionSort(int[] tab, boolean ifIncreasing) {
        this.tab = tab;
        this.ifIncreasing = ifIncreasing;
    }

    public int[] selectionSort() {


        int temp;
        int localMinimum;
        for (int j = 0; j < tab.length; j++) {
            int indexOfMinimum = j;
            localMinimum = tab[j];
            for (int i = j+1; i < tab.length; i++) {
                if (localMinimum > tab[i]) {
                    localMinimum = tab[i];
                    indexOfMinimum = i;
                }
            }
            temp = tab[j];
            tab[j] = localMinimum;
            tab[indexOfMinimum] = temp;
        }
        return tab;
    }
}
