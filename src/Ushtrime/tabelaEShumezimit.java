package Ushtrime;

import java.util.Scanner;

public class tabelaEShumezimit {
/*tabela momentale eshte per numra deri ne 10*/
    public static void main(String[] args) {
        Scanner teDhenat = new Scanner(System.in);
        int  i , prodhimi;

        System.out.println("Vendosni numrin per te gjeneruar tabelen e shumezimit : ");
        int numer = teDhenat.nextInt();

        for (i = 0 ; i < 11 ; i++){
            prodhimi = i * numer ;
            System.out.println(numer + " * " + i + " = " + prodhimi);
        }

    }

}
