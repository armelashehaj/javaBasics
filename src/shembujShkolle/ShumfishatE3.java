package shembujShkolle;

public class ShumfishatE3 {
    public static void main(String[] args) {
        int n = 5 , m = 5 ;
        int[][] v1 = new int[n][m];
        v1[0][0] = 1 ;
;

        for (int i = 0 ; i < v1.length ; i++){
            for (int j =0 ; j < v1[i].length ; j++){
                v1[i][j] = (i + 1) * (j + 1) * 3;
                System.out.printf("%d\t" , v1[i][j] );
            }
            System.out.printf("\n");
        }
    }
}
