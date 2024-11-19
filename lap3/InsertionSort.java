package hus.oop.lap3;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }

        for (int j : array) {
            System.out.println(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] intArray = {0, -9, 3, 9, 12, 10, -4};
        insertionSort(intArray);
    }

}
