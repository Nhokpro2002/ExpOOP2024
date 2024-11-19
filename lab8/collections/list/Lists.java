package hus.oop.lab8.collections.list;
import java.util.*;

public class Lists {

    /**
     * Function to insert an element into a list at the beginning
     */
    public static void insertFirst(List<Integer> list, int value) {
        // TODO
        list.add(0, value);
    }

    /**
     * Function to insert an element into a list at the end
     */
    public static void insertLast(List<Integer> list, int value) {
        // TODO
        list.add(list.size(), value);
    }

    /**
     * Function to replace the 3rd element of a list with a given value
     */
    public static void replace(List<Integer> list, int value) {
        // TODO
        list.set(2, value);
    }

    /**
     * Function to remove the 3rd element from a list
     */
    public static void removeThird(List<Integer> list) {
        // TODO
        list.remove(2);
    }

    /**
     * Function to remove the element "666" from a list
     */
    public static void removeEvil(List<Integer> list) {
        // TODO
        if (list.contains(666)) {
            list.removeAll(Collections.singleton(666));
        }
    }

    /**
     * Function returning a List<Integer> containing the first 10 square numbers (i.e., 1, 4, 9, 16, ...)
     */
    public static List<Integer> generateSquare() {
        // TODO
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int a = i * i;
            list.add(a);
        }
        return list;
    }

    /**
     * Function to verify if a list contains a certain value
     */
    public static boolean contains(List<Integer> list, int value) {
        // TODO
        return list.contains(value);
    }

    /**
     * Function to copy a list into another list (without using library functions)
     * Note well: the target list must be emptied before the copy
     */
    public static void copy(List<Integer> source, List<Integer> target) {
        // TODO
        target.clear();
        for (int element: source) {
            target.add(element);
        }
    }

    /**
     * Function to reverse the elements of a list
     */
    public static void reverse(List<Integer> list) {
        // TODO
        Collections.reverse(list);
    }

    /**
     * Function to reverse the elements of a list (without using library functions)
     */
    public static void reverseManual(List<Integer> list) {
        // TODO
        List<Integer> tempList = new ArrayList<>();
        int j = list.size();
        for (int i = list.size() - 1; i >= 0; i--) {
            tempList.add(list.get(i));
            j--;
        }
        list.clear();
        list.addAll(tempList);
    }

    /**
     * Function to insert the same element both at the beginning and the end of the same LinkedList
     * Note well: you can use LinkedList-specific methods
     */
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        // TODO
        list.addFirst(value);
        list.addLast(value);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        //reverse(list);
        reverseManual(list);
        for (int element: list) {
            System.out.print(element + " ");
        }
        System.out.println();

        insertFirst(list, 5);
        insertLast(list, 7);

        for (int element: list) {
            System.out.print(element + " ");
        }

    }
}
