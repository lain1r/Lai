package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class _task {
public static void main(String[] args) {
    int b = 1;
    String[] arr = new String[10];
    Scanner sc = new Scanner(System.in);
    for (int a = 0; a<arr.length; a++){
        System.out.println("напишите " + b + " слово");
        String userWord = sc.nextLine();

        if ((userWord.equalsIgnoreCase("exit") || (userWord.equalsIgnoreCase("выход")))){
            break;
        }
        arr[a] = userWord;
        b++;
    }
    System.out.println(Arrays.toString(arr));
}
}