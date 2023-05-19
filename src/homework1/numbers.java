package homework1;
import java.util.Scanner;
public class numbers {
    public static void main(String[] args) {
        numberReverse();
        numbersRightToLeft();
        difficultPercent();
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

    /**
     * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
     * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
     * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
     */
    private static void difficultPercent() {
        System.out.print("\nTask 3\nInput sum of money : ");
        Scanner in = new Scanner(System.in);

        double money = in.nextInt();
        double profitOfYear = money / 10 + money;
        double profitOfTwoYears = profitOfYear / 10 + profitOfYear;
        double profitThreeYears = profitOfTwoYears / 10 + profitOfTwoYears;

        System.out.println("profit for three years : " + profitThreeYears);
    }

}

