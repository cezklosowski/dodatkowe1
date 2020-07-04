public class BinarySearchMain {
    public static void main(String[] args) throws Exception {
        // java ma implementacje:
        // Arrays.binarySearch(tab, searched)
        // Collections.binarySearch(tab, searched)

        Integer[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        BinarySearch<Integer> binarySearch = new BinarySearch<>(10,tab);
        int position = binarySearch.binarySearch();
        System.out.println(position);

        // nie działa na charakterach, napisać lepszy komparator
        /*
        Character[] tab2 = {'a', 'b', 'c', 'd', 'A', 'B', 'C', 'D'};
        BinarySearch<Character> binarySearch2 = new BinarySearch<>('c',tab2);
        int position2 = binarySearch2.binarySearch();
        System.out.println(position2);

         */


    }


}
