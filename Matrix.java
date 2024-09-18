import java.util.Scanner;

public class Matrix {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];
        int i, j, pos = 0,row,col;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        if(m[3][3]==1) System.out.println(pos);
        else{;
  outer: for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (m[i][j] == 1) {
                    row=i;
                    col=j;
                    break outer;
                }
            }
        }//i

    }//else
}
}