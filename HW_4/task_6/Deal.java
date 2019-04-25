package HW_4.task_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        // названия мастей смотрел здесь https://ru.wikipedia.org/wiki/%D0%9A%D0%B0%D1%80%D1%82%D0%BE%D1%87%D0%BD%D0%B0%D1%8F_%D0%BC%D0%B0%D1%81%D1%82%D1%8C
        String kards[] = {"2-Pik", "2-buben", "2-cherv", "2-tref", "3-Pik", "3-buben", "3-cherv", "3-tref", "4-Pik", "4-buben", "4-cherv", "4-tref", "5-Pik", "5-buben", "5-cherv", "5-tref",
                "6-Pik", "6-buben", "6-cherv", "6-tref", "7-Pik", "7-buben", "7-cherv", "7-tref", "8-Pik", "8-buben", "8-cherv", "8-tref", "9-Pik", "9-buben", "9-cherv", "9-tref",
                "10-Pik", "10-buben", "10-cherv", "10-tref", "Valet-Pik", "Valet-buben", "Valet-cherv", "Valet-tref", "Dama-Pik", "Dama-buben", "Dama-cherv", "Dama-tref",
                "Korol-Pik", "Korol-buben", "Korol-cherv", "Korol-tref", "Tuz-Pik", "Tuz-buben", "Tuz-cherv", "Tuz-tref",};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько будет игроков?");// Количество игроков смотрел тут https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D0%BA%D0%B5%D1%80
        int players = scanner.nextInt();
        if (players > 10) {
            System.out.println("Поиграйте лучше в футбол, вас слишком много!");
        } else if (players == 1) {
            System.out.println("Найди себе друзей!");
        } else if (players < 1) {
            System.out.println("Не шути так!");
        } else if (players > 2 && players < 10) {
            Collections.shuffle(Arrays.asList(kards));//Рандомное перемешивание массива
                                                                 /*https://ru.stackoverflow.com/questions
                                                                                            /540464/%D0%A0%D0%B0%D0%BD%D0%B4%D0%BE%D0%BC%D0%BD%D0%BE%D0%B5 -%D0%BF%D0%B5%D1%80%D0%B5%D0%BC%D0%B5%D1%88%D0%B8%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D0%B0*/

            for (int i = 0; i < 5*players; i++) {
                System.out.print(kards[i] + " ");
                if (i==4 || i == 9 || i == 14 || i == 19 || i == 24 || i == 29  || i == 34 || i == 39 || i == 44 || i == 49)
                    System.out.println();
            }
            //System.out.println(Arrays.toString(kards));
            {

            }
        }

    }

}
