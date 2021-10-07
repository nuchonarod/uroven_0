package lab_3;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Zadanie_4 {
    public void zad_4(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту: ");
        double h = scan.nextDouble();
        double g = 9.8;
        double otvet =sqrt(2 * h / g);
        System.out.println(otvet);
    }

}
