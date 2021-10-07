package lab_3;

import java.util.Scanner;

public class Zadanie_3 {
    public void zad_3(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое действительное число: ");
        double num_1 = scan.nextDouble();
        System.out.println("Введите второе действительное число: ");
        double num_2 = scan.nextDouble();

        double sum = num_1 + num_2;
        double dif = num_1 - num_2;
        double comp = num_1 * num_2;

        System.out.println("Сумма = " + sum + "\n" + "Разность = " + dif + "\n" + "Произведение = " + comp);

    }
}
