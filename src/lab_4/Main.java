package lab_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задания(от 1 до 2): ");
        int a = scan.nextInt();

        switch(a){
            case 1:
                System.out.println("В разработке...");
                break;
            case 2:
                zadanie_2 progr = new zadanie_2();
                progr.zad_2();
                break;
            default:
                System.out.println("вы неверно ввели номер задания");
        }
    }
}
