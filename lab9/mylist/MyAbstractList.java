package hus.oop.lab9.mylist;

public abstract class MyAbstractList implements MyList {

    // Phương thức kiểm tra chỉ số nằm trong phạm vi hợp lệ
    void checkBoundaries(int index, int limit) {
        if (index < 0 || index >= limit) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds. Valid range: 0 to " + (limit - 1));
        }
    }

    // Phương thức toString() để biểu diễn danh sách dưới dạng chuỗi
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("["); // Bắt đầu chuỗi danh sách với dấu mở ngoặc vuông
        for (int i = 0; i < size(); i++) {
            sb.append(get(i).toString()); // Lấy phần tử tại vị trí i và chuyển nó thành chuỗi
            if (i < size() - 1) {
                sb.append(", "); // Thêm dấu phẩy giữa các phần tử, ngoại trừ phần tử cuối cùng
            }
        }
        sb.append("]"); // Kết thúc chuỗi danh sách với dấu đóng ngoặc vuông
        return sb.toString();
    }
}
