package hus.oop.lab6;

public class TestAnimals {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sơn Vũ Đại");
        System.out.println(dog1);
        dog1.greets();
        System.out.println();

        Dog dog2 = new Dog("Sơn");
        System.out.println(dog2);
        dog2.greets(dog2);
    }
    //Dog dog1 = new Dog("Sơn Vũ Đại");


}
