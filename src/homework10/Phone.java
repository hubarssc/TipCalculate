package homework10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * *написать класс Phone, создать лист с его элементами. написать функцию,
 * которая на вход будет принимать тип сортировки (по дате, по цене) и вывести отсортированные элементы.
 * Преобразования над элементами коллекции производить с помощью Stream API
 */


public class Phone {
    public static void main(String[] args) {
        List<Phone> phoneList = Arrays.asList(
                new Phone("iPhone X", "2019", 600),
                new Phone("Pixel 2", "2000", 500),
                new Phone("iPhone 8", "2015", 450),
                new Phone("Nokia 9", "2014", 150),
                new Phone("Galaxy S9", "2018", 300)
        );

        sortByType(phoneList, "date"); // Сортировка по дате
        System.out.println("--------");
        sortByType(phoneList, "price"); // Сортировка по цене
    }

    private final String name;
    private final String date;
    private final int price;

    public Phone(String name, String date, int price) {
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public static void sortByType(List<Phone> phones, String sortType) {
        Comparator<Phone> comparator;

        if (sortType.equals("date")) {
            comparator = Comparator.comparing(Phone::getDate);
            System.out.println("Сортировка по дате:");
        } else if (sortType.equals("price")) {
            comparator = Comparator.comparingInt(Phone::getPrice);
            System.out.println("Сортировка по цене:");
        } else {
            System.out.println("Неподдерживаемый тип сортировки.");
            return;
        }

        phones.stream()
                .sorted(comparator)
                .forEach(p -> System.out.printf("%s (%s) %d\n", p.getName(), p.getDate(), p.getPrice()));
    }
}






