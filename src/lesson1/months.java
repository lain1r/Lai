package lesson1;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите месяц (число от 1 до 12)");
        int months = sc.nextInt();
        if (months == 3 || months == 4 || months == 5)
            System.out.println("весна");
        else if (months == 1 || months == 2 || months == 12)
            System.out.println("зима");
        else if (months == 6 || months == 7 || months == 8)
            System.out.println("лето");
        else if (months == 9 || months == 10 || months == 11)
            System.out.println("осень"); else System.out.println("нету столько месяцев");
    }
}
