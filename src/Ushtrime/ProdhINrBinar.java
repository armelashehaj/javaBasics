package Ushtrime;

import java.util.Scanner;
public class ProdhINrBinar {
    public static void main(String[] args)
    {
        long nr1, nr2, prodhimi = 0;
        int shifer, faktor = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Vendosni numrin e pare : ");
        nr1 = in.nextLong();
        System.out.print("Vendosni numrin e dyte ");
        nr2 = in.nextLong();
        while (nr2 != 0)
        {
            shifer = (int)(nr2 % 10);
            /*shifra mban shifren e fundit te numrit te dyte*/
            if (shifer == 1)
            {
                nr1 = nr1 * faktor;
                /*nqs 1 ath  nr i pare eshte 1*/
                prodhimi = prodhimiBinar((int) nr1, (int) prodhimi);
            }
            else
            {
                nr1 = nr1 * faktor;
                /*nqs 0 ath  nr i pare eshte 0*/
            }
            nr2 = nr2 / 10;
            faktor = 10;
        }
        System.out.print("Prodhimi i dy numrave eshte :  " + prodhimi+"\n");
        System.out.println("sfdgdhf");
    }

    /*funksion */
    static int prodhimiBinar (int n1, int n2)
    {
        int i = 0, mbetje = 0;
        int[] shuma = new int[20];
        /*Ruaj shumen ne nje vektor pasi dua qe shifrat te ruhen ne qeliza te ndara.
        * Filloj nga fundi i vektorit per te marr fillimisht shifrat ne fund.*/
        int rezultati = 0;

        while (n1 != 0 || n2 != 0)
        {
            shuma[i++] = (n1 % 10 + n2 % 10 + mbetje) % 2;
            /*
            * 1 % 2 = 1 gjithmon
            * dhe 0 % 2 = 0 gjithmone
            * */

            //1
            mbetje = (n1 % 10 + n2 % 10 + mbetje) / 2;
            //0.5 ... 0
            /*  */
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        if (mbetje != 0) //eshte 1
        {
            shuma[i++] = mbetje;
        }
        //else
        --i;
        while (i >= 0) //nis nga vlera me e madhe e ruajtur ne vektor
        {
            rezultati = rezultati * 10 + shuma[i--];
            /*Mqs nis nga shifra e fundit shumezoj gjithmone me 10 per te rritur vleren e shifres tjeter qe mblidhet ne
            * menyre qe shifra e pare qe lexuam te qendroj e fundit*/
        }
        return rezultati;
    }
}