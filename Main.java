import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {34, 87, 10, 56, 9, 2};

        bubbleSort(numbers);

        System.out.println("Sorted array: ");
        for (int num : numbers)
            System.out.print(num + " ");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i=0; i < n-1; i++) {

            swapped = false;

            for (int j=0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }
}
