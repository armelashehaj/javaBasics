package shembujShkolle;

import java.util.Scanner;

/*lista e fakulteteve dhe degeve te tyre*/
public class UBT {
    public static void main(String[] args) {
        shfaqInformacionPerFakultetet();
        int fakulteti = zhgjidhFakultetin();
        shfaqDegetEFakultetit(fakulteti);
    }
    
    protected static void shfaqInformacionPerFakultetet()
    {
        System.out.println("Fakultetet ne UBT jane : \n1. FBM Fakulteti i Bujqësisë dhe Mjedisit\n" +
                "2.FEA Fakulteti i Ekonomisë dhe Agrobiznesit\n" +
                "3.FBU Fakulteti i Bioteknologjisë dhe Ushqimit\n" +
                "4.FSHP Fakulteti i Shkencave Pyjore\n" +
                "5.FMV Fakulteti i Mjekësisë Veterinare\n");
    }
    
    protected  static  int zhgjidhFakultetin()
    {
        Scanner teDhenat = new Scanner(System.in);
        System.out.println("Vendosni numrin e fakultetit , degen e te cilit doni te dini: \t  ");
        int n = teDhenat.nextInt();
        if (n < 1 || n > 5 ){
            while (n < 1 || n > 5){
                System.out.println("Numri i vendosur nuk eshte i sakte ! \n" +
                        "Ju lutem vendosni numrin e fakultetit , degen e te cilit doni te dini: \t  ");
                n = teDhenat.nextInt();
            }
        }
        
        return n;
    }
    
    protected static void shfaqDegetEFakultetit(int fakulteti)
    {
        switch (fakulteti){
            case 1 :
                System.out.println("Biologji Marine dhe Akuakulturë\n" +
                        "Hortikulturë\n" +
                        "Arkitekturë Peizazhi\n" +
                        "Menaxhim i Burimeve Natyrore\n" +
                        "Agronomi\n" +
                        "Agromekanizim\n" +
                        "Zootekni dhe Siguria e Produkteve Blegtorale\n" +
                        "Bioteknologji Zooveterinare\n" +
                        "Inxhinieri Agromjedisi\n" +
                        "Agrobiologji");
                break;
            case 2 :
                System.out.println("Menaxhim Agrobiznesi\n" +
                        "Ekonomi dhe Politikat e Zhvillimit Rural\n" +
                        "Ekonomiksi e Aplikuar\n" +
                        "Financë Kontabilitet\n" +
                        "Informatikë Biznesi\n" +
                        "Manaxhim i Turizmit Rural");
                break;
            case 3 :
                System.out.println("Teknologji Agroushqimore\n" +
                        "Vreshtari Enologji\n" +
                        "Shkencat e Ushqimit dhe të Ushqyerit");
                break;

            case 4 :
                System.out.println("Inxhinieri Pyjore\n" +
                        "Dizajni i Mobiljeve dhe Interierit\n" +
                        "Inxhinieri Perpunim Druri\n");
                break;
            case 5 :
                System.out.println("Menaxhim Veterinar");
                break;
            default:
                System.out.println("Numri i vendosur nuk eshte i sakte ! ");
        }
    }
}
