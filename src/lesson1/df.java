package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class df {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int a = 0, b = 5; a<arr.length; a++, b+=5){
            arr[a] = b * 10;
        }
        System.out.println(Arrays.toString(arr));

    }
}
