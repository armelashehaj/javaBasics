package shembujShkolle;

import java.util.Scanner;

public class FaturaElektrike {
    public static void main(String[] args) {
        Scanner teDhenat = new Scanner(System.in);
        System.out.println("Vendosni sasine e harxhuar ne muaj :");
        double sasiaEEnergjise = teDhenat.nextDouble();
        float LekePerKiloVat = 1.31f ;
        System.out.println("Ju duhet te paguani " + sasiaEEnergjise * LekePerKiloVat + "ALL.");

    }

}


