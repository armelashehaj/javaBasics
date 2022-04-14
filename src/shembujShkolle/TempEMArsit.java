package shembujShkolle;

import java.util.Scanner;
import java.util.Vector;

public class TempEMArsit {
    public static void main(String[] args) {
        Scanner teDhenat = new Scanner(System.in);
        Vector<Double> temp =  new Vector<Double>(31);
        double shuma = 0;

        for (int i = 0 ; i < 31 ; i++){
            System.out.println("Vendosni temperaturen per diten "+ i +" :");
            temp.add(teDhenat.nextDouble());
            shuma = shuma + temp.get(i);

        }
        System.out.println("Mesatarisht temperaturat kane qene "+ shuma/31 + ".");
        double min = temp.get(0);
        for (int i = 0 ; i < temp.size() ; i++){
            if(min > temp.get(i)){
                min = temp.get(i);
            }
        }
        System.out.println("Vlera me e vogel eshte "+ min);

        double max = temp.get(0);
        for (int i = 0 ; i < temp.size() ; i++){
            if(max  < temp.get(i)){
                max = temp.get(i);
            }
        }
        System.out.println("Vlera me e vogel eshte "+ max);

    }
}
