package hus.oop.lab9.phonebook;

import java.util.ArrayList;

/**
 * A PhoneBook implementation internally using ArrayList. Slow!
 */
public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        // TODO
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        // TODO
        for (Student element: phoneBook) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        // TODO
        for (Student element: phoneBook) {
            if (element.getLastName().equals(lastname)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        // TODO
        for (Student element: phoneBook) {
            if (element.getPhone().equals(phone)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        // TODO
        int index = 0;
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getPhone().equals(phone)) {
                index = i;
                break;
            }
        }
        phoneBook.remove(index);
    }
}

