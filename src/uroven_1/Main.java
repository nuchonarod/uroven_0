package uroven_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number_task = new Scanner(System.in);
        System.out.println("Выберите номер задания(от 1 до 8): ");
        int num = number_task.nextInt();

        switch (num){
            case 1:
                Zadanie_1 infa = new Zadanie_1();
                System.out.println(infa.a + " " + infa.b + " " + infa.s);
                break;
            case 2:
                Zadanie_2 kvadrat = new Zadanie_2();
                kvadrat.zad_2();
                break;
            case 3:
                Zadanie_3 plus_minus = new Zadanie_3();
                plus_minus.zad_3();
                break;
            case 4:
                Zadanie_4 java = new Zadanie_4();
                java.zad_4();
                break;
            case 5:
                Zadanie_5 new_year = new Zadanie_5();
                new_year.zad_5();
                break;
            case 6:
                Zadanie_6 amigo = new Zadanie_6();
                amigo.zad_6();
                break;
            case 7:
                Zadanie_7 cod = new Zadanie_7();
                cod.zad_7();
                break;
            case 8:
                Zadanie_8 summa = new Zadanie_8();
                summa.zad_8();
                break;
            default:
                System.out.println("Вы ввели неверный номер задания");

        }
    }
}
