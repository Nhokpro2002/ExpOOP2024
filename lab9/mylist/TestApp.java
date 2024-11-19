package hus.oop.lab9.mylist;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestApp {
    public static void main(String[] args) {
        // Tạo file để ghi kết quả
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("outputTestAppMyList.txt"))) {

            // Test MyArrayList
            writer.write("Testing MyArrayList:\n");
            MyArrayList arrayList = new MyArrayList();

            arrayList.add("Element 1");
            arrayList.add("Element 2");
            arrayList.add("Element 3");

            writer.write("Array List after adding elements: \n");
            writer.write(arrayList.toString() + "\n");

            // Add at a specific index
            arrayList.add("Element 4", 1);
            writer.write("Array List after adding at index 1: \n");
            writer.write(arrayList.toString() + "\n");

            // Get element at index 2
            writer.write("Element at index 2: " + arrayList.get(2) + "\n");

            // Remove element at index 0
            arrayList.remove(0);
            writer.write("Array List after removing element at index 0: \n");
            writer.write(arrayList.toString() + "\n");

            writer.write("Size of ArrayList: " + arrayList.size() + "\n");

            writer.write("------------\n");

            // Test MyLinkedList
            writer.write("Testing MyLinkedList:\n");
            MyLinkedList linkedList = new MyLinkedList();

            linkedList.add("Node 1");
            linkedList.add("Node 2", 0);
            linkedList.add("Node 3");

            writer.write("Linked List after adding nodes: \n");
            writer.write(linkedList.toString() + "\n");

            // Get element at index 1
            writer.write("Element at index 1: " + linkedList.get(1) + "\n");

            // Remove element at index 0
            linkedList.remove(0);
            writer.write("Linked List after removing node at index 0: \n");
            writer.write(linkedList.toString() + "\n");

            writer.write("Size of LinkedList: " + linkedList.size() + "\n");

            writer.close();  // Đảm bảo đóng file sau khi ghi

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
