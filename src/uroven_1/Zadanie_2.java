package uroven_1;

import java.util.Scanner;

public class Zadanie_2 {
    public void zad_2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число, квадрат которого хотите получить: ");
        int a = scan.nextInt();
        System.out.println("Квадрат числа равен: " + a*a);
    }
}
