package hus.oop.lab9.phonebook;

import java.util.HashMap;

/**
 * A PhoneBook implementation internally using HashMap
 */
public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        /* TODO */
        phoneBook = new HashMap<>();
    }

    // We use the phone number as key because it is unique
    public void addPerson(Student s) {
        /* TODO */
        phoneBook.put(s.getPhone(), s);
    }

    public Student searchByName(String name) {
        /* TODO */
        // đối số new Student[0] để khởi tạo kích thước mảng là 0 ( không có phần tử nào)
        // to Array sẽ xem xét nếu mảng khởi tạo không códđủ phần tử thì sẽ tự động thêm vào
        Student[] studens = phoneBook.values().toArray(new Student[0]);
        for (Student elements: studens) {
            if (elements.getName().equals(name)) {
                return elements;
            }
        }
        return null;
    }

    public void deleteByNumber(String phone) {
       phoneBook.remove(phone);
    }


    public Student searchByLastName(String lastname) {
        /* TODO */
        // đối số new Student[0] để khởi tạo kích thước mảng là 0 ( không có phần tử nào)
        // to Array sẽ xem xét nếu mảng khởi tạo không códđủ phần tử thì sẽ tự động thêm vào
        Student[] studens = phoneBook.values().toArray(new Student[0]);
        for (Student elements: studens) {
            if (elements.getLastName().equals(lastname)) {
                return elements;
            }
        }
        return null;
    }

    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

}
