package homework8;

import java.util.ArrayList;

public class ListCentering {

    /**
     * Средняя (3 балла)
     * Центрировать заданный список list, уменьшив каждый элемент на среднее арифметическое всех элементов.
     * Если список пуст, не делать ничего. Вернуть изменённый список.
     * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
     */

    public static void main(String[] args) {
        // Пример использования
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Исходный список: " + list);

        ArrayList<Integer> centeredList = centerList(list);

        System.out.println("Изменённый список: " + centeredList);
    }

    public static ArrayList<Integer> centerList(ArrayList<Integer> list) {
        int sum = 0;
        int size = list.size();

        // Вычисляем сумму всех элементов в списке
        for (int num : list) {
            sum += num;
        }

        // Вычисляем среднее арифметическое
        double average = (double) sum / size;

        // Уменьшаем каждый элемент на среднее арифметическое
        for (int i = 0; i < size; i++) {
            list.set(i, list.get(i) - (int) average);
        }

        return list;
    }
}

