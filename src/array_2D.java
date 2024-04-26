import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class array_2D extends array_1D {
    protected int[][] b;
    protected int n, m;

    public array_2D() {}

    public array_2D(int row, int col) {
        n = row;
        m = col;
        Random random = new Random();
        b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = random.nextInt(1, 11);
            }
        }
    }





    public void func() {
        int sumFirst = 0;
        int sumSeckond = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < n / 2) sumFirst += b[i][j];
                else sumSeckond += b[i][j];
            }
        }

        int startPos;
        if (sumFirst > sumSeckond) startPos = 0;
        else startPos = n / 2;

        int c;

        for (int i = startPos; i < n / 2 + startPos; i++){
            Arrays.sort(b[i]);

            for (int j = 0; j < m/2;j++){
                c = b[i][j];
                b[i][j] = b[i][m - j - 1];
                b[i][m - j - 1] = c;
            }
        }
    }

    public void arrayPrint(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
