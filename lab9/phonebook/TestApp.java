package hus.oop.lab9.phonebook;

/**
 * The PhoneBook interface defines the functionalities of a basic phone book.
 * Provide two different implementations of the PhoneBook interface
 * working with the use case below. The first (a) internally uses
 * an ArrayList, the second (b) internally uses a HashMap.
 */
public class TestApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap();

        // Comment this line for switching implementation
        // PhoneBook pb = new PhoneBookArray();

        pb.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Student("Marco", "Rizzo", "45243"));
        pb.addPerson(new Student("Luisa", "Poppi", "24564"));

        System.out.println(pb.searchByName("Marco"));
        System.out.println(pb.searchByLastName("Poppi"));

        // Does not exist!
        System.out.println(pb.searchByNumber("1111"));

        // Delete an element!
        pb.deleteByNumber("24564");
        System.out.println(pb.searchByLastName("Poppi"));
    }
}

