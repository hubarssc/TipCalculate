package homework5;

    // найти в массиве самую длинную последовательность
public class arrayLength {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6};
        int maxLength = 1; // переменная для хранения длины самой длинной последовательности
        int maxElement = array[0]; // переменная для хранения элемента, являющегося началом самой длинной последовательности
        int currentLength = 1; // переменная для хранения текущей длины последовательности
        int currentElement = array[0]; // переменная для хранения текущего элемента

        for (int i = 1; i < array.length; i++) {
            if (array[i] == currentElement) {
                currentLength++; // продолжаем текущую последовательность
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxElement = currentElement;
                }
                currentElement = array[i];
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxElement = currentElement;
        }

        System.out.println("Длина самой длинной последовательности: " + maxLength);
        System.out.println("Номер элемента, являющегося началом: " + maxElement);
    }
}

