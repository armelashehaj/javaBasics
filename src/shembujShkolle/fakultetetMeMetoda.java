package shembujShkolle;

import java.util.Scanner;

public class fakultetetMeMetoda {
    public static void main(String[] args) {
              int m = 5 , n = 5 ;
        int[][] deget = new int[n][m];

        mbushjaEMatrices(deget );
        System.out.println("Maksimumi i degeve eshte :" + maksimumiIDegeve(deget));

    }

    /**
     *
     * @param matrice
     */
    private static  void mbushjaEMatrices(int matrice[][]){
        Scanner teDhenat = new Scanner(System.in);
        String[] programetEStudimit = {"Programi 2 vjecar" ,
                "Bachelor" ,
                "Master Profesional " ,
                "Master Shkencor"};
        System.out.println("Programet e studimit ne UBT jane :");
        for (String VleraAktuale : programetEStudimit)
            System.out.println("\t\t"+ VleraAktuale);
        System.out.println("Fakultetet  ne UBT jane :");
        String[] fakulteti = {"Fakulteti i Bujqesise dhe Mjedisit" ,
                "Fakulteti i Ekonomise dhe Agrobiznesit" ,
                "Fakulteti i Bioteknologjise dhe Ushqimit" ,
                "Fakulteti i Shkencave Pyjore" ,
                "Fakulteti i Mjeksise Veterinare"};

        for (String VlereAktuale : fakulteti)
            System.out.println("\t\t"+VlereAktuale);

        for(int i = 0 ; i < programetEStudimit.length ; i++){
            for(int j = 0 ; j < fakulteti.length ; j++){
                System.out.println("Vendosni numrin e degeve per " + programetEStudimit[i] +
                        " , " + fakulteti[j] + " : " );
               matrice[i][j] = teDhenat.nextInt();
            }
        }
    }

    /**
     *
     * @param matrice
     * @return
     */
    private static int maksimumiIDegeve (int matrice[][]){
        int max = matrice[0][0];
        /*Mqs matrice kubike ath kemi gjatesine e rreshtave te njejte me gjatesine e kolonave
        * ndaj perdor tek te dyja matrice.length , ne te kundert do merrja si parametra dhe gjatesine
        * e rreshtave dhe kolonave */

        /*Gjej nje here maksimumin*/
        for(int i = 0 ; i < matrice.length ; i++){
            for(int j = 0 ; j < matrice.length ; j++){
                if(max < matrice[i][j])
                    max = matrice[i][j];
            }
        }
    return max ;
    }

}
