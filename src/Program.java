import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        numberReverse();
        numbersRightToLeft();
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

    /**
     * Пользователь задает целое число, больше или равно 100 (например, 3801).
     * Определить третью цифру справа в этом числе (в данном случае 8).
     */
    private static void numbersRightToLeft() {
        System.out.print("\nTask 2\nInput number from 100 : ");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int thirdNumber = num / 100 % 10; // нашли третье число с права на лево

        System.out.println("The third number is from right to left : " + thirdNumber);
    }

}

