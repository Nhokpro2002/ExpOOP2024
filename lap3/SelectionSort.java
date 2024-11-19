package hus.oop.lap3;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                   min = j;
                }
            }
            if (min != i) {
                int term = array[min];
                array[min] = array[i];
                array[i] = term;
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] intArray = {0, -9, 3, 9, 12, 10, -4};
        selectionSort(intArray);
    }
}
