package lesson1;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int a = 1, q = 0; q<10; q++, a++){
            for(int b = 1, qq = 0; qq<10;qq++, b++){
                arr[qq] = a*b;
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}
