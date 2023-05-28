package homework9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * <p>
 * Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
 * Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
 * Замерьте время, которое потрачено на это.
 * Сравните результаты и предположите, почему они именно такие.
 */

public class ListPerformance {
    private static final int numElements = 1000000;
    private static final int numRandomSelections = 100000;
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Время добавления
        long arrayListAddTime = addElements(arrayList);
        long linkedListAddTime = addElements(linkedList);

        // Замеряем время выбора элементов наугад
        long arrayListRandomAccessTime = getRandomAccessTime(arrayList);
        long linkedListRandomAccessTime = getRandomAccessTime(linkedList);

        // Выводим результаты замеров времени
        System.out.println("ArrayList add time: " + arrayListAddTime + " ms");
        System.out.println("LinkedList add time: " + linkedListAddTime + " ms");
        System.out.println("ArrayList random access time: " + arrayListRandomAccessTime + " ms");
        System.out.println("LinkedList random access time: " + linkedListRandomAccessTime + " ms");
    }

    // Метод для добавления элементов в список
    private static long addElements(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numElements; i++) {
            list.add(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    // Метод для выбора элементов наугад из списка
    private static long getRandomAccessTime(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numRandomSelections; i++) {
            int randomIndex = random.nextInt(numElements);
            list.get(randomIndex);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}


