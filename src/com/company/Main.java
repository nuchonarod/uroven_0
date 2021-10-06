package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner number_task = new Scanner(System.in);
        System.out.println("Выберите номер задания(от 1 до 8): ");
        int num = number_task.nextInt();

        switch (num) {
            case 1:
                // Первое задание
                Zadanie_1 amigo = new Zadanie_1();
                amigo.zad_1();
                break;
            case 2:
                // Второе задание
                Zadanie_2 kruto = new Zadanie_2();
                kruto.zad_2();
                break;
            case 3:
                // Третье задание
                Zadanie_3 elli = new Zadanie_3();
                Scanner scan = new Scanner(System.in);
                System.out.println("Сколько раз вывести строку?");
                int num_elli = scan.nextInt();
                elli.zad_3(num_elli);
                break;
            case 4:
                // Четвёртое задание
                Zadanie_4 god = new Zadanie_4();
                god.zad_4();
                break;
            case 5:
                // Пятое задание
                Zadanie_5 infa = new Zadanie_5();
                System.out.println(infa.age);
                break;
            case 6:
                // Шестое задание
                Zadanie_6 ficha = new Zadanie_6();
                ficha.zad_6();
                break;
            case 7:
                // Седьмое задание
                Zadanie_7 komm = new Zadanie_7();
                komm.zad_7();
                break;
            case 8:
                // Восьмое задание
                Zadanie_8 summ = new Zadanie_8();
                summ.zad_8();
                break;
            default:
                System.out.println("Неверно введён номер задания");
        }
    }
}
