public class SelectionSortMain {
    public static void main(String[] args) {
        int[] tab = {6, 2, 1, 10, 15, 7,  6, 9, 10, 12, 7, 15, 3};
        printTab(tab);
        SelectionSort selectionSort = new SelectionSort(tab, true);
        int[] tabSorted = selectionSort.selectionSort();
        printTab(tabSorted);

    }

    public static void printTab(int[] tab){
        for (int i : tab) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
