package common;

import java.util.Scanner;

public class MergeArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float[] a;
        float[] b;
        float[] c;

        System.out.println("---Input array a---");
        a = input();
        System.out.println("---Input array b---");
        b = input();

        c = merge(a, b);

        show(c);
    }
    public static float[] input() {
        System.out.print("Input elements of the array: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        float[] arr = new float[n];
        System.out.print("Input element of the array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void sortASC(float [] arr) {
        float temp;
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static float[] merge(float[] a, float[] b) {
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = a.length + b.length - 1;
        float[] c = new float[cIndex + 1];

        // sắp xếp các mảng theo thứ tự tăng dần
        sortASC(a);
        sortASC(b);

        for (int i = cIndex; i > -1; i--) {
            if (aIndex > -1 && bIndex > -1) {
                if (a[aIndex] > b[bIndex]) {
                    c[i] = a[aIndex--];
                } else {
                    c[i] = b[bIndex--];
                }
            } else if (bIndex == -1) {
                c[i] = a[aIndex--];
            } else if (aIndex == -1) {
                c[i] = b[bIndex--];
            }
        }
        return c;
    }

    public static void show(float[] arr) {
        for (float v : arr) {
            System.out.print(v + " ");
        }
    }
}
