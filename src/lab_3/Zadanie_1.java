package lab_3;

import java.util.Scanner;

public class Zadanie_1 {

    public void zad_1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите степень 2, которую хотите получить: ");
        int a = scan.nextInt();
        int two = 2;

        for(int i = 1; i<a; i++){
            two = two * 2;
        }

        System.out.println(two);
    }
}
