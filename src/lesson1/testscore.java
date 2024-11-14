package lesson1;

import java.util.Scanner;

public class testscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите сколько вы набрали баллов");
        int score = sc.nextInt();
        if (score >= 80 & score <= 100)
            System.out.println("оценка 5");
        if (score >= 60 & score <= 79)
            System.out.println("оценка 4");
        if (score >= 40 & score <= 59)
            System.out.println("оценка 3");
        if (score < 40)
            System.out.println("оценка 2");
        if (score == 0)
            System.out.println("0 iq мув, иди в садик");
        else System.out.println("невозможное количество баллов");
    }
}