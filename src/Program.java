import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        System.out.print("Input number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        String romanNumeral = convertToRoman(number);
        System.out.print("result = " + romanNumeral);
    }

    public static String convertToRoman(int number) {
        int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < decimalValues.length; i++) {
            while (number >= decimalValues[i]) {
                romanNumeral.append(romanSymbols[i]);
                number -= decimalValues[i];
            }
        }

        return romanNumeral.toString();
    }
}
