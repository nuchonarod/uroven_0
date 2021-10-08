package lab_4;

public class zadanie_2 {
    public void zad_2(){

        double num = 0;

        for(double i = 1; i<=10000; i++){
           if(i % 2 == 0) {
               num -= 1 / i;
           } else {
               num += 1 / i;
           }
        }

        System.out.println(num);
    }
}
