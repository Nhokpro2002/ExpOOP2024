package hus.oop.lap3;

public class RecursiveBinarySearch {
    // Error with case input ( key > all elements of intArray ), fix

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx > toIdx) {
            return false;
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                return binarySearch(array, key, fromIdx, middleIdx - 1);
            } else {
                return binarySearch(array, key, middleIdx + 1, toIdx);
            }
        }
    }

    public static void test() {
        // test binarySearch using recursive with intArray has element is old number
        int[] intArray = {-9, 0, 5, 8};
        System.out.println(binarySearch(intArray, 0, 0, intArray.length));
        System.out.println(binarySearch(intArray, -9, 0, intArray.length));
        System.out.println(binarySearch(intArray, 10, 0, intArray.length));

    }

    public static void main(String[] args) {
        test();
    }
}
