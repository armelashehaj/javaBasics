package shembujShkolle;

import java.util.Scanner;

public class rrugaPerTirane {
    /*Supozoj nje shpejtesi mesatare te vozitjes me makine ne km/s  */
    private static final int shpejtesiMesatare = 65;
    private static final int hapaMesatar  = 15;

    public static void main(String[] args) {
        /*te ndertohet nje program i cili merr si input
        * qytetin tuaj te lindjes dhe largesine  e tij nga tirana,
        * dhe i afishon perdoruesit kohen qe i duhet per te mberritur
        * ne Tirane me makine ose ne kembe ne vendlindje*/

        /*Objekti teDhenat me te cilat do te marr te dhenat input*/
        Scanner teDhenat = new Scanner(System.in);

        float largesia ;
        String emerQyteti ;

        System.out.println("Vendosni emrin e qytetit tuaj : ");
        emerQyteti = teDhenat.next();
        System.out.println("Vendosni largesine e qytetit tuaj nga Tirana ne kilometra : ");
        largesia = teDhenat.nextFloat();

        /*Mqs po marr nje shpejtesi mesatare dhe distancen  ath
        * t = largesi /shpejtesi  , */
        double koha = llogaritKohen(largesia, shpejtesiMesatare);
      System.out.printf("Koha qe ju duhet per te shkuar nga %s per ne Tirane eshte  " , emerQyteti);
        FormatimiIkohes(koha);

       koha = llogaritKohenNeHapa(largesia , hapaMesatar);
       System.out.printf("Koha qe ju duhet per te shkuar nga %s per ne Tirane " +
               "ne kembe eshte " , emerQyteti );
        FormatimiIkohes(koha);

    }

    /**
     * @param largesia
     * @param shpejtesiMesatare
     * @return float
     */
    private static double llogaritKohen(float largesia, int shpejtesiMesatare) {

        double koha = largesia / shpejtesiMesatare ;
        return  koha ;
    }
    private  static void FormatimiIkohes(double kohaFillestare){

        int[] formatiIKohes = new int[2];
        int kohaNeSek ;
        kohaNeSek =(int) (3600 * kohaFillestare) ;

        int oreTotal ;
        oreTotal = kohaNeSek / 3600 ;
        formatiIKohes[0] = oreTotal ;

        int minutaTotal ;
        minutaTotal = (kohaNeSek - (oreTotal * 3600))/60;
        formatiIKohes[1] = minutaTotal ;

        System.out.printf("%d ore %d minuta \n" , formatiIKohes[0] , formatiIKohes[1]);
    }

    /**
     *
     * @param largesia
     * @param hapaMesatar
     * @return
     */
    private  static  double llogaritKohenNeHapa (float largesia , int hapaMesatar){
        double koha = largesia / hapaMesatar ;
        return  koha;
    }

}
