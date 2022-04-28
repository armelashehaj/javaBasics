package shembujShkolle;

import java.util.Scanner;
import java.util.Arrays;

public class fakultetet {
    public static void main(String[] args) {

        Scanner teDhenat = new Scanner(System.in);
        int n = 4 , m = 5 ;
        int[][] deget = new int[n][m];

        String[] fakulteti = {"Fakulteti i Bujqesise dhe Mjedisit" ,
        "Fakulteti i Ekonomise dhe Agrobiznesit" ,
        "Fakulteti i Bioteknologjise dhe Ushqimit" ,
        "Fakulteti i Shkencave Pyjore" ,
        "Fakulteti i Mjeksise Veterinare"};

        String[] programetEStudimit = {"Programi 2 vjecar" ,
        "Bachelor" ,
        "Master Profesional " ,
        "Master Shkencor"};

        System.out.println("Programet e studimit ne UBT jane :");
        for (String VleraAktuale : programetEStudimit)
            System.out.println("\t\t"+ VleraAktuale);

        System.out.println("Fakultetet  ne UBT jane :");

        for (String VlereAktuale : fakulteti)
            System.out.println("\t\t"+VlereAktuale);

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.println("Vendosni numrin e degeve per " + programetEStudimit[i] +
                        " , " + fakulteti[j] + " : " );
                deget[i][j] = teDhenat.nextInt();
            }
        }

        int max = 0;
/*Gjej nje here maksimumin*/
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(max < deget[i][j])
                    max = deget[i][j];
            }
        }

        /*Kontrolloj per maksimumin neper tabele per te afishuar fakultetin dhe programin e studimit*/
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            if(max == deget[i][j])
                System.out.println(programetEStudimit[i] +" per "+fakulteti[j] + " ka " + max + " dege.");
        }
    }
        System.out.printf("\n");

    int shuma = 0 ;

    for (int i = 0 ; i < n ; i++){
        shuma = 0 ;
        for(int j = 0 ; j < m ; j++){
            shuma = shuma + deget[i][j];
        }
        System.out.println(programetEStudimit[i] + " ka gjithesej " + shuma + " dege.");
    }
        System.out.printf("\n");

    int[] shumaF = new int[m];
    int[] vektorRezerve = new int[m];
    for (int j = 0 ; j < m; j++){
        shuma = 0 ;
        for(int i = 0 ; i < n ; i++){
            shuma = shuma + deget[i][j];
            shumaF[j] = shuma ;
            vektorRezerve[j] = shuma;
        }
        System.out.println(fakulteti[j] + " ka gjithsej " + shuma + " dege.");
    }
        System.out.printf("\n");
        Arrays.sort(shumaF);

          for (int i = 0 ; i < shumaF.length ; i++){
            for (int j = 0 ; j < vektorRezerve.length ; j++){
                if(shumaF[i] == vektorRezerve[j] ){
                    System.out.println(fakulteti[j] + " ka " + shumaF[i] + " dege.");
                }
            }
        }
        System.out.printf("\n");

    }

}
