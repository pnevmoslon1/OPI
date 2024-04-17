import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class array_2D extends array_1D {
    private int[][] a;
    private int n, m;

    public array_2D() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = random.nextInt(1, 11);
            }
        }
    }





    public void func() {
        int sumFirst = 0;
        int sumSeckond = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < n / 2) sumFirst += a[i][j];
                else sumSeckond += a[i][j];
            }
        }

        int startPos;
        if (sumFirst > sumSeckond) startPos = 0;
        else startPos = n / 2;

        for (int i = startPos; i < n / 2 + startPos; i++){
            Arrays.sort(a[i]);

        }
    }

    public void arrayPrint(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
