package lab_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задание(от 1 до 5): ");
        int num = scan.nextInt();

        switch (num){
            case 1:
                Zadanie_1 stepen = new Zadanie_1();
                stepen.zad_1();
                break;
            case 2:
                Zadanie_2 factorial = new Zadanie_2();
                factorial.zad_2();
                break;
            case 3:
                Zadanie_3 oper = new Zadanie_3();
                oper.zad_3();
                break;
            case 4:
                Zadanie_4 fizika = new Zadanie_4();
                fizika.zad_4();
                break;
            case 5:
                Zadanie_5 tre = new Zadanie_5();
                tre.zad_5();
                break;
            default:
                System.out.println("Вы ввели неверный номер задания");
        }
    }
}
