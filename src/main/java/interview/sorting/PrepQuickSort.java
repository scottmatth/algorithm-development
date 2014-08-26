package interview.sorting;

import java.util.Random;

/**
 * Created by scootdog on 8/23/14.
 */
public class PrepQuickSort {
    public static void quicksort(int[] testArray) {
        quicksort(testArray, 0, testArray.length-1);
    }

    private static void quicksort(int[] testArray, int first, int last) {
        if (first<last) {
            int partitionIndex = partition(testArray, first, last);

            quicksort(testArray, first, partitionIndex-1);
            quicksort(testArray, partitionIndex+1, last);
        }
    }

    private static int partition(int[] testArray, int first, int last) {

        int pivotIndex = choosePivot(testArray, first, last);
        int pivot = testArray[pivotIndex];
        int temp = testArray[pivotIndex];
        testArray[pivotIndex] = testArray[last];
        testArray[last] = temp;

        int keepIndex = first;

        for(int index = first;index <= last;index ++) {
            if(testArray[index]<pivot) {
                temp = testArray[index];
                testArray[index]  = testArray[keepIndex];
                testArray[keepIndex] = temp;
                keepIndex++;
            }
        }
        temp = testArray[last];
        testArray[last]  = testArray[keepIndex];
        testArray[keepIndex] = temp;

        return keepIndex;
    }

    private static int choosePivot(int[] testArray, int first, int last) {
        Random pivotRange = new Random();
        return pivotRange.nextInt(last-first) + first;
    }

}
