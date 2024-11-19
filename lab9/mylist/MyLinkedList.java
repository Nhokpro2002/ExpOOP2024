package hus.oop.lab9.mylist;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {  // Dừng khi i < index
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        if (head == null) {
            head = new MyLinkedListNode(o, null);
        } else {
            MyLinkedListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new MyLinkedListNode(o, null));
        }
        size++;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    @Override
    public Object get(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {  // Dừng khi i < index
            current = current.getNext();
        }
        return current.getPayload();
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = head.getNext();  // Cập nhật head nếu xóa node đầu tiên
        } else {
            MyLinkedListNode preNode = getNodeByIndex(index - 1);
            MyLinkedListNode currentNode = getNodeByIndex(index);
            preNode.setNext(currentNode.getNext());  // Liên kết lại node trước và node sau
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }
}
