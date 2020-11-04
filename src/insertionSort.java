public class insertionSort {
    public static void main(String[] args) {
        int[] testArray = new int[]{-86, 73, 88, 458, -637, 8659, 74, -43, 10};
        insertionSorting(testArray);
        for (int i : testArray) {
            System.out.println(i);
        }
    }

    public static void insertionSorting(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j-1] >= temp) {
                array[j] = array[j-1];
                --j;
            }
            array[j] = temp;
        }
    }
}
