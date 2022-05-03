package shembujShkolle;

import java.util.Scanner;

public class Makina {
    private static String modeli ;
    private static String ngjyra ;
    private static int nrRrotave ;
    private static int FuqiaEMotorit ;
    private static boolean isItEco ;
    private static String llojiIKarburantit;

    public Makina(){}

  public Makina (String modeli , String ngjyra ) {
      this();
      this.modeli = modeli;
      this.ngjyra = ngjyra;
  }

  public Makina(int nrRrotave , int FuqiaEMotorit){
        this();
      this.nrRrotave = nrRrotave;
      this.FuqiaEMotorit = FuqiaEMotorit ;
  }

    public Makina(boolean isItEco){
        this();
        this.isItEco = isItEco;}

    public Makina(String llojiIKarburantit){
        this();
        this.llojiIKarburantit = llojiIKarburantit;
    }

    public  static  int getNrRrotave(){
        return nrRrotave ;
    }

    public static String getModeli(){
        return  modeli;
    }

    public  static  String getNgjyra(){
        return  ngjyra;
    }

    public static String getLlojiIKarburantit(){
        return llojiIKarburantit;
    }

    public static int getFuqiaEMotorit(){
        return  FuqiaEMotorit;
    }

    public static boolean isIsItEco (){
        return isItEco;
    }

    public static void setIsItEco(boolean isItEco) {
        Makina.isItEco = isItEco;
    }

    public static void setLlojiIKarburantit(String llojiIKarburantit) {
        Makina.llojiIKarburantit = llojiIKarburantit;
    }

    public static void setFuqiaEMotorit(int fuqiaEMotorit) {
        FuqiaEMotorit = fuqiaEMotorit;
    }

    public static void setModeli(String modeli) {
        Makina.modeli = modeli;
    }

    public static void setNgjyra(String ngjyra) {
        Makina.ngjyra = ngjyra;
    }

    public static void setNrRrotave(int nrRrotave) {
        Makina.nrRrotave = nrRrotave;
    }

    public static void main(String[] args) {
        Scanner teDhenat = new Scanner(System.in);

        System.out.println("Cili eshte modeli i makines suaj :");
        getModeli();
        System.out.println(" Cili eshte ");
         System.out.println("Nr i rrotave " + getNrRrotave() + "Fuqia e motorrit " + getFuqiaEMotorit() +
                 "Ngjyra " + getNgjyra() + "Lloji i karburantit " + getLlojiIKarburantit()  );

    }

}
