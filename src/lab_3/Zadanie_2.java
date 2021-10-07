package lab_3;

import java.util.Scanner;

public class Zadanie_2 {
    public void zad_2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите получить");
        int factor = scan.nextInt();
        int a = 1;
        for(int i=1; i<=factor;i++){
            a = a*i;
        }
        System.out.println(a);
    }
}
