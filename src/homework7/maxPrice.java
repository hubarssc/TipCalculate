package homework7;

public class maxPrice {

        /**
         * <p>
         * Строка содержит названия товаров и цены на них в формате вида
         * "Хлеб 39.9; Молоко 62; Курица 184.0; Конфеты 89.9".
         * То есть, название товара отделено от цены пробелом, а цена отделена от названия следующего товара точкой с запятой и пробелом.
         * Вернуть название самого дорогого товара в списке(в примере это Курица),
         * или пустую строку при нарушении формата строки.
         * Все цены должны быть больше нуля либо равны нулю.
         * В случае неверной строки выкинуть свое исключение.
         */

        public static void main(String[] args) {

            String data = "Хлеб 39.9; Молоко 62; Курица 184.0; Конфеты 89.9";
            String[] items = data.split(";");

            double maxPrice = Double.MIN_VALUE;
            String maxItem = "";

            for (String item : items) {

                String[] parts = item.trim().split("\\s+");

                if (parts.length == 2) {

                    String itemName = parts[0];

                    try {
                        double itemPrice = Double.parseDouble(parts[1]);

                        if (itemPrice > maxPrice) {
                            maxPrice = itemPrice;
                            maxItem = itemName;
                        }
                    } catch (NumberFormatException e) {

                        System.out.println("Неверный формат строки");
                    }
                }
            }

            System.out.println("Самый дорогой товар: " + maxItem);
        }
    }










