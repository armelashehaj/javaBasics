package shembujShkolle;

import java.util.Scanner;

public class KrahesimiINumrave {
    public static void main(String[] args) {
        Scanner teDhena = new Scanner(System.in);

        System.out.println("Vendosni numrin e studenteve vitin e pare :");
        int n1 = teDhena.nextInt();
        System.out.println("Vendosni numrin e studenteve vitin e dyte :");
        int n2 = teDhena.nextInt();
        System.out.println("Vendosni numrin e studenteve vitin e trete :");
        int n3 = teDhena.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Numri me i larte i studenteve eshte :" + n1);
        } else if (n2 > n3) {
            System.out.println("Numri me i larte i studenteve eshte :" + n2);
        } else {
            System.out.println("Numri me i larte i studenteve eshte :" + n3);
        }
    }
}
