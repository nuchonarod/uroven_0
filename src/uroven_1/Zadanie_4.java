package uroven_1;

import java.util.Scanner;

public class Zadanie_4 {
    public void zad_4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько раз вывести строку?");
        int a = scan.nextInt();

        for(int i = 1; i<=a; i++){
            System.out.println(i + ") JavaRush. Learn once - use anywhere");
        }
    }
}
