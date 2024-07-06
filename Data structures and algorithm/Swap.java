public class Swap{
    public static void main(String[] args) {
        int number = 97;
        int number2 = 65;

        int third = number;
        number = number2;
        number2 = third;

        System.out.println(number);
        System.out.println(number2);
    }
}