package Ushtrime;

public class ForEach {
    public static void main(String[] args) {

        int[] v1 = {10, 27, 19, 18};
        int[] v2 = {53, 82, 13, 9};
        int[] shuma = new int[v1.length]; /*merr gjatesine e vektorit te pare*/

        for (int i = 0 ; i < shuma.length ; i++){
            shuma[i] = v1[i] + v2[i];
        }
        /*afishimi i cdo velere te vektorit shuma */
        for (int VleraAktuale : shuma) {
            System.out.println(VleraAktuale);
        }
    }
    }

