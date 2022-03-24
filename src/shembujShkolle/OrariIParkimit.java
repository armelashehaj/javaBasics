package shembujShkolle;
import java.util.Scanner;

public class OrariIParkimit {
    public static void main(String[] args) {
        Scanner teDhenat = new Scanner(System.in);
        System.out.println("Vendosni orain e hyrjes  : ");
        int orarHyrje = teDhenat.nextInt();
        System.out.println("Vendosni orain e daljes  : ");
        int orarDalje = teDhenat.nextInt();
        int diferenca = orarDalje - orarHyrje ;

        if (diferenca <=3 ){
            System.out.println("Ju duhet te paguani " + diferenca * 100 + "Leke");
        }
        else if (diferenca > 3 && diferenca <= 5) {
            System.out.println("Ju duhet te paguani " + diferenca * 200 + "Leke");
        }
        else {
            System.out.println("Ju duhet te paguani " + diferenca * 300 + "Leke");
        }

    }
}
