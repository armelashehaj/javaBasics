package Ushtrime;

import java.util.Scanner;
import  java.lang.Math.*;

public class PDheSipERrethit {
    public static void main(String[] args) {

        Scanner teDhena = new Scanner(System.in);

        System.out.print("Vendosni rrezen e rrethit :");
        double rreze = teDhena.nextDouble();

        double perimetri = 2 * Math.PI * rreze;
        double syprina = Math.PI * rreze * rreze ;
        System.out.println("Perimetri i rrethit eshte " + perimetri + ". Syprina e rrethit eshte " + syprina);
    }

}
