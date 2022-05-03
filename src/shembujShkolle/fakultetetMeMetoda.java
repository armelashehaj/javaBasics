package shembujShkolle;

import java.util.Arrays;
import java.util.Scanner;

public class fakultetetMeMetoda {
    /**
     *  Numer fakultetesh
     */
    private static final int numerFakultetesh = 5;
    /**
     *  Numer programesh
     */
    private static final int numerProgramesh = 5;

    public static void main(String[] args) {
        int[][] deget = new int[numerProgramesh][numerFakultetesh];

        String[] programetEStudimit = getProgrametEStudimit();
        String[] fakulteti = getFakultete();

        vendosNumrinEDegeve(deget, programetEStudimit, fakulteti);
        System.out.printf("\n");
        gjejMaksimuminEDegeve(deget, programetEStudimit, fakulteti);
        System.out.printf("\n");
        llogaritShumenSipasProgramit(deget, programetEStudimit);
        System.out.printf("\n");
        shumaEDegeve(deget);
        System.out.printf("\n");
        renditjaEFakulteteve(deget, fakulteti);
        System.out.printf("\n");

    }

    /**
     *
     * @param deget
     * @param programetEStudimit
     * @param fakultetet
     */
    private static void vendosNumrinEDegeve(int[][] deget, String[] programetEStudimit, String[] fakultetet) {
        Scanner teDhenat = new Scanner(System.in);

        System.out.println("Programet e studimit ne UBT jane :");
        for (String programi : programetEStudimit)
            System.out.println("\t\t" + programi);

        System.out.println("Fakultetet  ne UBT jane :");

        for (String fakulteti : fakultetet)
            System.out.println("\t\t" + fakulteti);

        for (int pozicionProgrami = 0; pozicionProgrami < programetEStudimit.length; pozicionProgrami++) {
            for (int pozicionFakulteti = 0; pozicionFakulteti < fakultetet.length; pozicionFakulteti++) {
                System.out.println("Vendosni numrin e degeve per " + programetEStudimit[pozicionProgrami] + " , " + fakultetet[pozicionFakulteti] + " : ");
                int numriIDegeve = teDhenat.nextInt();
                deget[pozicionProgrami][pozicionFakulteti] = numriIDegeve;
            }
        }
    }

    /**
     * @param deget
     * @param programetEStudimit
     * @param fakultetet
     */
    private static void gjejMaksimuminEDegeve(int[][] deget, String[] programetEStudimit, String[] fakultetet) {
        int max = 0;
        /*Mqs matrice kubike ath kemi gjatesine e rreshtave te njejte me gjatesine e kolonave
         * ndaj perdor tek te dyja matrice.length , ne te kundert do merrja si parametra dhe gjatesine
         * e rreshtave dhe kolonave */
        /*Gjej nje here maksimumin*/
        for (int pozicioniProgramitNeDeg = 0; pozicioniProgramitNeDeg < deget.length; pozicioniProgramitNeDeg++) {
            for (int pozicioniIFakultetitNeDege = 0; pozicioniIFakultetitNeDege < deget.length; pozicioniIFakultetitNeDege++) {
                if (max < deget[pozicioniProgramitNeDeg][pozicioniProgramitNeDeg]) max = deget[pozicioniProgramitNeDeg][pozicioniIFakultetitNeDege];
            }
        }
        /*Kontrolloj per maksimumin neper tabele per te afishuar fakultetin dhe programin e studimit*/
        for (int pozicioniProgramitNeDeg = 0; pozicioniProgramitNeDeg < deget.length; pozicioniProgramitNeDeg++) {
            for (int pozicioniIFakultetitNeDege = 0; pozicioniIFakultetitNeDege < deget.length; pozicioniIFakultetitNeDege++) {
                if (max == deget[pozicioniProgramitNeDeg][pozicioniIFakultetitNeDege]) System.out.println(programetEStudimit[pozicioniProgramitNeDeg] + " per " + fakultetet[pozicioniIFakultetitNeDege] + " ka " + max + " dege.");
            }
        }
    }

    /**
     * @param m
     * @param v1
     */
    private static void llogaritShumenSipasProgramit(int m[][], String[] v1) {
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

    /**
     * @return String[]
     */
    protected static  String[] getProgrametEStudimit()
    {
        return new String[]{"Programi 2 vjecar", "Bachelor", "Master Profesional ", "Master Shkencor"};
    }

    /**
     * @return String[]
     */
    protected static  String[] getFakultete()
    {
        return new String[] {"Fakulteti i Bujqesise dhe Mjedisit", "Fakulteti i Ekonomise dhe Agrobiznesit", "Fakulteti i Bioteknologjise dhe Ushqimit", "Fakulteti i Shkencave Pyjore", "Fakulteti i Mjeksise Veterinare"};
    }
}

