import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        MinDivisor();
        MaxDivisor();
        luckyNumber();
        NumberOfDigits();
        minMultiple();
        BrickAndHole();
    }

    /**
     * Простая (2 балла)
     * <p>
     * Для заданного числа n > 1 найти минимальный делитель, меньший n
     */
    public static void MinDivisor() {
        System.out.print("Task 1\nInput number > 1 : ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 2;

        while (i <= n) {
            if (n % i == 0 && i > 1) {
                System.out.println("result = " + i);
                break;
            }
            i++;
        }
    }

    /**
     * Простая (2 балла)
     * <p>
     * Для заданного числа n > 1 найти максимальный делитель, меньший n
     */
    public static void MaxDivisor() {
        System.out.println("Task 2 \nInput number > 1 : ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = n - 1;

        while (i > 1) {
            if (n % i == 0) {
                System.out.println("result = " + i);
                break;
            }
            i--;
        }
    }

    /**
     * Простая (2 балла)
     * <p>
     * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
     * Определить, счастливое ли заданное число, вернуть true, если это так.
     */
    public static void luckyNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Task 3 \nInput four-digit number : ");

        int num = in.nextInt();
        int firstTwoDigits = num % 100;
        int secondDigit = firstTwoDigits % 10;
        int firstDigit = firstTwoDigits / 10;

        int lastTwoDigits = num / 100;
        int fourthDigit = lastTwoDigits / 10;
        int thirdDigit = lastTwoDigits % 10;

        int sumOfFirstTwoDigits = secondDigit + firstDigit;
        int sumOfLastTwoDigits = fourthDigit + thirdDigit;

        if (sumOfFirstTwoDigits == sumOfLastTwoDigits) {
            System.out.println("result = " + true);
        } else
            System.out.println("result =" + false);
    }

    /**
     * Простая (2 балла)
     * <p>
     * Найти количество цифр в заданном числе n.
     * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
     * <p>
     * Использовать операции со строками в этой задаче запрещается.
     */

    public static void NumberOfDigits() {
        Scanner in = new Scanner(System.in);
        System.out.print("Tusk 4 \nInput number : ");
        int length = (int) (Math.log10(in.nextInt()) + 1);
        System.out.println("Length = " + length);

    }

    /**
     * Средняя (3 балла)
     * <p>
     * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
     * минимальное число k, которое делится и на m и на n без остатка
     */

    public static void minMultiple() {
        Scanner in = new Scanner(System.in);
        System.out.print("Tusk 5 \nInput m : ");

        int m = in.nextInt();
        System.out.print("input n : ");
        int n = in.nextInt();
        int k = 1;
        boolean p = false;

        while (!p) {
            if (k % m == 0 && k % n == 0) {
                p = true;
                System.out.println("result = " + k);
            }
            k++;
        }
    }

    /**
     * Средняя (3 балла)
     * <p>
     * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
     * Стороны отверстия должны быть параллельны граням кирпича.
     * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
     * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
     * Вернуть true, если кирпич пройдёт
     */
    public static void BrickAndHole() {

        Scanner in = new Scanner(System.in);

        System.out.println("Tusk 6");

        System.out.print("Input a : ");
        int a = in.nextInt();
        System.out.print("Input b : ");
        int b = in.nextInt();
        System.out.print("Input c : ");
        int c = in.nextInt();
        System.out.print("Input r : ");
        int r = in.nextInt();
        System.out.print("Input s : ");
        int s = in.nextInt();
        boolean result = false;

        if ((a <= r && b <= s) || (a <= s && b <= r)) {
            result = true;
        }
        if ((a <= r && c <= s) || (a <= s && c <= r)) {
            result = true;
        }
        if ((b <= r && c <= s) || (b <= s && c <= r)) {
            result = true;
        }

        System.out.println("result = " + result);
    }
}






















