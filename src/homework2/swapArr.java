package homework2;
import java.util.Arrays;
public class swapArr {
//swap min value and max value in array
    public static void main(String[] args) {

        int[] arr = {6, 2, 1, 33, 7, 4, 11};
        int[] newArr = new int[arr.length];
        int max = arr[0];
        int min = arr[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;

            }
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == indexMax) {
                newArr[i] = min;

            } else if (i == indexMin) {
                newArr[i] = max;
            } else {
                newArr[i] = arr[i];
            }

        }
        System.out.println("max = " + max + "\nmin = " + min);
        System.out.println(Arrays.toString(newArr));

    }
}








