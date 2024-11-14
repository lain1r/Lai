package lesson1;

import java.util.Random;
import java.util.Scanner;

public class newtest {
    public static void main(String[] args) {
        int attempt = 5; // кол во попыток
        Random rn = new Random();
        int rnum = rn.nextInt(100-1);// рандомное число, которое нужно угадать

        System.out.println(rnum);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Угадай число и получи много денег. Введи число(осталось 5 попыток)");
        int num = sc1.nextInt(); // вводимое число от игрока
        if (rnum > num){
            System.out.println("больше");
        } else if(rnum < num) {
            System.out.println("меньше");
        }// первая корректировка числа
        if (num > 100 || num < 1){
            System.out.println("некорректное число");
        } --attempt;

        while (rnum != num && attempt > 0){
            --attempt;
            System.out.println("не угадал, ещё попытка"  );
            num = sc1.nextInt();
            if (rnum > num && num > 0){
                System.out.println("больше");
            } else if(rnum < num && num < 101) {
                System.out.println("меньше");
            } else if (num > 100 || num < 0) {
                System.out.println("некорректное число");
            }
    }
        if (attempt >= 0 && num == rnum){
            System.out.print("выйграл. осталось попыток: ");
            System.out.println( attempt );
        } else if (attempt == 0 && num != rnum){
            System.out.println("проиграл");//вывод проигрыша выйграша
}
    }
}
