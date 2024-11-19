package hus.oop.lab8.collections.set;
import java.util.*;

public class Sets {
    /**
     * Function returning the intersection of two given sets
     * (without using library functions)
     */
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        /* TODO */
        Set<Integer> intersectionSet = new HashSet<>();

        for (int element: first) {
            if (second.contains(element)) {
                intersectionSet.add(element);
            }
        }
        return intersectionSet;

    }


    /**
     * Function returning the union of two given sets
     * (without using library functions)
     */
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        /* TODO */
        Set<Integer> unionSet = new HashSet<>(first);
        for (int element: second) {
            unionSet.add(element);
        }
        return unionSet;
    }

    /**
     * Function returning the intersection of two given sets (see retainAll())
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        /* TODO */
        first.retainAll(second);
        return first;
    }

    /**
     * Function returning the union of two given sets (see addAll())
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        /* TODO */
        first.addAll(second);
        return first;
    }

    /**
     * Function to transform a set into a list without duplicates
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> toList(Set<Integer> source) {
        /* TODO */
        return new ArrayList<>(source);
    }

    /**
     * Function to remove duplicates from a list
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> removeDuplicates(List<Integer> source) {
        /* TODO */
        Set<Integer> set =  new HashSet<>(source);
        return new ArrayList<>(set);
    }

    /**
     * Function to remove duplicates from a list
     * without using the constructor trick seen above
     */
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        /* TODO */
        List<Integer> list = new ArrayList<>();
        for (int element: source) {
            if (!list.contains(element)) {
                list.add(element);
            }
        }
        return list;
    }

    /**
     * Function accepting a string,
     * returning the first recurring character
     * For example firstRecurringCharacter("abaco") -> a.
     */
    public static String firstRecurringCharacter(String s) {
        /* TODO */
        return null;
    }

    /**
     * Function accepting a string,
     * and returning a set comprising all recurring characters.
     * For example allRecurringChars("mamma") -> [m, a].
     */
    public static Set<Character> allRecurringChars(String s) {
        /* TODO */
        return new HashSet<>();
    }

    /**
     * Function to transform a set into an array
     */
    public static Integer[] toArray(Set<Integer> source) {
        /* TODO */
        Integer[] intArray = source.toArray(new Integer[0]);
        return intArray;
    }

    /**
     * Function to return the first item from a TreeSet
     * Note well: use TreeSet-specific methods
     */
    public static int getFirst(TreeSet<Integer> source) {
        /* TODO */
        return source.first();
    }

    /**
     * Function to return the last item from a TreeSet
     * Note well: use TreeSet-specific methods
     */
    public static int getLast(TreeSet<Integer> source) {
        /* TODO */
        return source.last();
    }

    /**
     * Function to get an element from a TreeSet
     * which is strictly greater than a given element.
     * Note well: use TreeSet-specific methods
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        /* TODO */
        return source.higher(value);
    }

}

