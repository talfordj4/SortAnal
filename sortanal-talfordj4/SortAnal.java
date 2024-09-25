// <Jyren O. Talford>

import java.util.Random;

public class SortAnal {

    public static void main(String[] args) {
        int[] sizes = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000, 11000, 12000, 13000, 14000, 15000, 16000,17000, 18000, 19000, 20000};

        System.out.println("Size of Array, Random Array Comparisons, Ascending Array Comparisons, & Descending Array Comparisons");
    
        for (int size : sizes) {
            int[] randomArray = createRandomArray(size);
            int[] ascendingArray = createAscendingArray(size);
            int[] descendingArray = createDescendingArray(size);

            int randomComparisons = insertionSort(randomArray.clone());
            int ascendingComparisons = insertionSort(ascendingArray.clone());
            int descendingComparisons = insertionSort(descendingArray.clone());

           System.out.printf("%d %d %d %d%n", size, randomComparisons, ascendingComparisons, descendingComparisons);
        }
    }

    private static int[] createRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }

    private static int[] createAscendingArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int[] createDescendingArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i - 1;
        }
        return array;
    }

    private static int insertionSort(int[] A) {
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            int v = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > v) {
                count++;
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;
            if (j >= 0) count++;
        }
        return count;
    }
}