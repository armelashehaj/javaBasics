package shembujShkolle;

import java.util.Scanner;
import java.util.Vector;
import  java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;  

public class Fatura {
    public static void main(String[] args) {
        Scanner teDhenat = new Scanner(System.in);
        /*Afishimi i artikujve */
        System.out.println("1.Kafe\t70\n" +
                "2.Makiato\t80\n" +
                "3.Uji\t70\n" +
                "4.Uj me vitamina\t120\n" +
                "5.Briosh\t70\n" +
                "6.Bravo\t150\n");
        /*Deklarimi i variablave */
         SimpleDateFormat formati = new SimpleDateFormat("dd/MM/yyyy ");
         Date date = new Date();
           int produkti, sasia, mbaro = 1;

        /*Vektori qe permban emrat e artikujve*/
        Vector<String> artikujt = new Vector<String>(6);
        artikujt.add("Kafe");
        artikujt.add("Makiato");
        artikujt.add("Uje");
        artikujt.add("Uje me vitamina");
        artikujt.add("Briosh");
        artikujt.add("Bravo");
        /*Perdor liste meqenese nuk e di madhesine fikse qe do te me duhet te perdor*/
        List<Integer> Sasia = new ArrayList<Integer>();
        List<Integer> nrIArtikullit = new ArrayList<Integer>();
        /*Vektori qe permban cmimet e artikujve sipas rradhes*/
        int[] cmimi = {70, 80, 70, 120, 70, 150};
        int i = 0 , shuma = 0;
/*Perseris deri sa klienti te perfundoj */
        while (mbaro != 0) {
            System.out.println("Ju lutem vendosni numrin e produktit qe doni te porosisni :\n");
            produkti = teDhenat.nextInt();
            /*Kontrolloj nese kodi i futur ose sasia eshte ne range qe ne kemi percaktuar */
            while (produkti < 1 || produkti > 6) {
                System.out.println("Produkti i vendosur nuk eshte ne liste ju lutem vendoseni serish :  \n");
                produkti = teDhenat.nextInt();
            }
            /*Shtoj ne liste kodin e produktit te zgjedhur dhe sasine e tij */
            nrIArtikullit.add(produkti);

            System.out.println("Sa eshte sasia e produktit qe ju doni :\n");
            sasia = teDhenat.nextInt();
            while (sasia < 1){
                                  System.out.println("Sasia e vendosur nuk mund te jepet . Ju lutem vendosni serish !Sa eshte sasia e produktit qe ju doni :\n");
                                   sasia = teDhenat.nextInt();  
            }
            Sasia.add(sasia);

            System.out.println("Nese keni perfunduar ju lutem shtypni 0 :");
            mbaro = teDhenat.nextInt();
            i++;
        }

    /*Afishimi i fatures */
  for (i = 0 ;i < nrIArtikullit.size(); i++){

            if (i == 0 ) {
                System.out.println("\t FATURE\t\n");
                System.out.print(formati.format(date) +"\n");
                System.out.println("Artikull\tSasi\tCmim\tTotal");
            }

            System.out.print("\n");
           System.out.print( artikujt.get(nrIArtikullit.get(i)-1) + "\t");
           System.out.print(Sasia.get(i)+"\t");
           System.out.print(cmimi[i]+"\t");
           shuma = shuma + (cmimi[i] * Sasia.get(i)) ;
           System.out.print(cmimi[i] * Sasia.get(i) +"\t");

        }

        System.out.println("\n"+"Shuma per tu paguar \t\t\t"+ shuma);
        float shumaPaTVSH =shuma - (float) (0.2 * shuma);
        System.out.println("Shuma pa TVSH (20%)\t\t\t"+ shumaPaTVSH);

     /*Mendoj se mund ta permiresoj afishimin :)*/
    }
}

