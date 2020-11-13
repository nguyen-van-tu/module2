package common;

import java.util.Arrays;

public class deleteElement {

    // Function to remove the element
    public static int[] removeTheElement(int[] arr,
                                         int index)
    {

        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }

    public static void main(String[] args)
    {

        int[] arr = { 54, 59, 61, 7, 83, 6 };

        System.out.println("Original Array: "
                + Arrays.toString(arr));

        int index = 3;

        System.out.println("Index to be removed: "
                + index);

        arr = removeTheElement(arr, index);
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }
}