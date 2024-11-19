package hus.oop.lap3;

public class LinerSearch {

    public static boolean linerSearch(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int linerSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static void testDrive() {
        int[] intArray = {2, 4, -9, 0, 5};
        int key = 5;
        if (linerSearch(intArray, key)) {
            System.out.println("The key appears at the " + linerSearchIndex(intArray, key) + " position in the array");
        }
    }

    public static void main(String[] args) {
        testDrive();
    }
}
