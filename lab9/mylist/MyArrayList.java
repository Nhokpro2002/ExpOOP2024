package hus.oop.lab9.mylist;

public class MyArrayList extends MyAbstractList {
    int size;
    Object[] elements;
    static final int INITIAL_SIZE = 16;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        Object[] temp = new Object[size + 1];

        // Sao chép các phần tử trước index vào temp
        for (int i = 0; i < index; i++) {
            temp[i] = elements[i];
        }

        // Chèn phần tử o tại index
        temp[index] = o;

        // Sao chép các phần tử sau index vào temp
        for (int j = index + 1; j < temp.length; j++) {
            temp[j] = elements[j - 1];
        }

        // Cập nhật lại elements với mảng temp
        elements = temp;
        size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);  // Kiểm tra chỉ số hợp lệ
        return elements[index];  // Trả về phần tử tại vị trí index
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);

        // Di chuyển các phần tử sau index lên một bước
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        // Đặt phần tử cuối cùng là null để giải phóng bộ nhớ (mặc dù trong Java Garbage Collector sẽ tự xử lý)
        elements[size - 1] = null;

        size--;
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
