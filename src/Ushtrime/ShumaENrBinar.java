package Ushtrime;

import java.util.Scanner;

public class ShumaENrBinar {
    public static void main(String[] args) {
        Scanner teDhena = new Scanner(System.in);

    /*Vendos kontrollin per numer binar */
        System.out.println("Vendosni numrin tuaj binar:");
        int nrBinar1 = teDhena.nextInt();
        System.out.println("Vendosni numrin tuaj binar:");
        int nrBinar2 = teDhena.nextInt();

        int i = 0, mbetja = 0;
        int[] shuma = new int[20]; //Deklarim vektori

            while (nrBinar1 != 0 || nrBinar2 != 0) {
                shuma[i++] = (int) ((nrBinar1 % 10 + nrBinar2 % 10 + mbetja) % 2);
                mbetja = (int) ((nrBinar1 % 10 + nrBinar2 % 10 + mbetja) / 2);
                nrBinar1 = nrBinar1 / 10;
                nrBinar2 = nrBinar2 / 10;
            }
            if (mbetja != 0) {
                shuma[i++] = mbetja;
            }
            --i;
            System.out.print("Shuma e numrave binar eshte  =");
            while (i >= 0) {
                System.out.print(shuma[i--]);
            }
        }
    }


