package homework7;


import java.util.Arrays;

public class numbers {

    /**
     * <p>
     * В строке представлено выражение вида "2 + 31 - 40 + 13",
     * использующее целые положительные числа, плюсы и минусы, разделённые пробелами.
     * Наличие двух знаков подряд "13 + + 10" или двух чисел подряд "1 2" не допускается.
     * Вернуть значение выражения (6 для примера).
     * Про нарушении формата входной строки бросить исключение IllegalArgumentException
     */

    public static class Main {
        public static void main(String[] args) {
            String expression = "2 + 31 - 40 + 13";
            String regex = "\\d+(\\s+[+\\-]\\s+\\d+)*";
            if (!expression.matches(regex)) {
                throw new IllegalArgumentException("Некорректный формат входной строки");
            }

            String[] elements = expression.split("\\s+(?=[+\\-])|(?<=[+\\-])\\s+");
            String[] numbers = new String[elements.length / 2 + 1];
            String[] operators = new String[elements.length / 2];

            for (int i = 0; i < elements.length; i++) {
                if (i % 2 == 0) {
                    numbers[i / 2] = elements[i];
                } else {
                    operators[i / 2] = elements[i];
                }
            }

            int result = Integer.parseInt(numbers[0]);

            for (int i = 1; i < numbers.length; i++) {
                int number = Integer.parseInt(numbers[i]);
                String operator = operators[i - 1];

                if (operator.equals("+")) {
                    result += number;
                } else if (operator.equals("-")) {
                    result -= number;
                }
            }

            System.out.println(result);
        }
    }
}
































