package lab_3;

import java.util.Scanner;
import static java.lang.Math.*;

public class Zadanie_5 {
    public void zad_5(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину катета: ");
        double katet = scan.nextFloat();
        System.out.println("Введите длину гипотенузы: ");
        double gip = scan.nextFloat();

        double otvet = sqrt(gip*gip - katet*katet);
        System.out.println(otvet);




    }
}
