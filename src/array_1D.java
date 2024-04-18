import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class array_1D {
    protected int[] a;
    protected int count;

    public int[] getA() {
        return a;
    }

    public array_1D(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        a = new int[count];
        for (int i = 0; i < count; i++){
            a[i] = random.nextInt(1,11);
        }
    }
    public int countMultipleFirst(){
        int kk = 0;
        int sum = 0;
        for (int i = 1; i < count; i++){
            if (a[i] % a[0] == 0) kk++;

        }

        return kk;
    }


    @Override
    public String toString() {
        return Arrays.toString(a);

    }
}
