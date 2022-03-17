package shembujShkolle;

import java.util.Scanner;

public class sipEShtepise {
    public static void main(String[] args) {
        Scanner teDhena = new Scanner(System.in);

        System.out.print("Vendosni numrin e dhomave");
        int nrDhomave = teDhena.nextInt();

        int  siperfaqe ;
        int i = 0;
        int ShumaESiperfaqeve = 0;

        for (i= 0 ;  i < nrDhomave ; i++ ){
            System.out.print("Vendosni gjatesine e dhomes: ");
            int gjatesia = teDhena.nextInt();
            System.out.print("Vendosni gjeresia e dhomes:");
            int gjeresia = teDhena.nextInt();

            siperfaqe = gjatesia * gjeresia ;
            System.out.println("Siperfaqja e dhomes eshte :" + siperfaqe);
             ShumaESiperfaqeve = ShumaESiperfaqeve + siperfaqe;
        }
 System.out.println("Siperfaqja e shtepise eshte " + ShumaESiperfaqeve);

    }

}
