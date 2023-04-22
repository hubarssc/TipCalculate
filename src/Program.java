import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        numberReverse();
    }

    /**
     * Пользователь задает целое трехзначное число (например, 478).
     * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
     */
    private static void numberReverse() {
        System.out.print("Task 1\nThree-digit number: ");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int hundreds = num / 100 % 100;
        int tens = num % 100 / 10;
        int units = num % 10;
        int reverseNumber = units * 100 + tens * 10 + hundreds;

        System.out.println("Inverted number: " + reverseNumber);
    }

}
