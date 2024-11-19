package hus.oop.lap1;

public class CheckOddEven {
    public static void main(String[] args) {
        int number = 49;
        System.out.println("The number is " + number);

        if(number%2 == 0){
            System.out.println(number + " is Even Number");
        }
        else {
            System.out.println(number + " is Odd Number");
        }
        System.out.println();
    }
}
