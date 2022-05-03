package shembujShkolle;

import java.util.Arrays;
import java.util.Scanner;

public class fakultetetMeMetoda {
    public static void main(String[] args) {
        int m = 5, n = 5;
        int[][] deget = new int[n][m];

        String[] programetEStudimit = {"Programi 2 vjecar", "Bachelor", "Master Profesional ", "Master Shkencor"};
        String[] fakulteti = {"Fakulteti i Bujqesise dhe Mjedisit", "Fakulteti i Ekonomise dhe Agrobiznesit", "Fakulteti i Bioteknologjise dhe Ushqimit", "Fakulteti i Shkencave Pyjore", "Fakulteti i Mjeksise Veterinare"};

        mbushjaEMatrices(deget, programetEStudimit, fakulteti);
        System.out.printf("\n");
        maksimumiIDegeve(deget, programetEStudimit, fakulteti);
        System.out.printf("\n");
        shumaSipasProgramit(deget, programetEStudimit);
        System.out.printf("\n");
        shumaEDegeve(deget);
        System.out.printf("\n");
        renditjaEFakulteteve(deget, fakulteti);
        System.out.printf("\n");

    }

    /**
     * @param m1
     */
    private static void mbushjaEMatrices(int m1[][], String[] v1, String[] v2) {
        Scanner teDhenat = new Scanner(System.in);

        System.out.println("Programet e studimit ne UBT jane :");
        for (String VleraAktuale : v1)
            System.out.println("\t\t" + VleraAktuale);

        System.out.println("Fakultetet  ne UBT jane :");

        for (String VlereAktuale : v2)
            System.out.println("\t\t" + VlereAktuale);

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                System.out.println("Vendosni numrin e degeve per " + v1[i] + " , " + v2[j] + " : ");
                m1[i][j] = teDhenat.nextInt();
            }
        }
    }

    /**
     * @param m
     * @param v1
     * @param v2
     */
    private static void maksimumiIDegeve(int m[][], String[] v1, String[] v2) {
        int max = 0;
        /*Mqs matrice kubike ath kemi gjatesine e rreshtave te njejte me gjatesine e kolonave
         * ndaj perdor tek te dyja matrice.length , ne te kundert do merrja si parametra dhe gjatesine
         * e rreshtave dhe kolonave */
        /*Gjej nje here maksimumin*/
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (max < m[i][j]) max = m[i][j];
            }
        }
        /*Kontrolloj per maksimumin neper tabele per te afishuar fakultetin dhe programin e studimit*/
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (max == m[i][j]) System.out.println(v1[i] + " per " + v2[j] + " ka " + max + " dege.");
            }
        }
    }

    /**
     * @param m
     * @param v1
     */
    private static void shumaSipasProgramit(int m[][], String[] v1) {
        int shuma = 0;
        for (int i = 0; i < v1.length; i++) {
            shuma = 0;
            for (int j = 0; j < m.length; j++) {
                shuma = shuma + m[i][j];
            }
            System.out.println(v1[i] + " ka gjithesej " + shuma + " dege.");
        }
    }

    /**
     * @param m
     */
    private static void shumaEDegeve(int m[][]) {
        int shuma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                shuma = shuma + m[i][j];
            }
        }
        System.out.println("Gjithsej jane " + shuma + " dege");

    }

    /**
     * @param m
     * @param v1
     */
    private static void renditjaEFakulteteve(int m[][], String[] v1) {
        int[] shumaF = new int[5];
        int[] vektorRezerve = new int[5];
        int shuma = 0;

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                shuma = shuma + m[i][j];
            }
            System.out.println(v1[j] + " ka " + shuma + " dege.");
            shumaF[j] = shuma;
            vektorRezerve[j] = shuma;
            shuma = 0;
        }
        Arrays.sort(shumaF);
        System.out.printf("\n");

        for (int i = 0; i < shumaF.length; i++) {
            for (int j = 0; j < vektorRezerve.length; j++) {
                if (shumaF[i] == vektorRezerve[j]) {
                    System.out.println(v1[j] + " ka " + shumaF[i] + " dege.");
                }
            }
        }

    }
}

