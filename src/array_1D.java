import java.util.Arrays;
import java.util.Random;

public class array_1D {
    protected int[] a;
    protected int count;

    public int[] getA() {
        return a;
    }

    public array_1D(){}

    public array_1D(int col){
        count = col;
        System.out.println("я пидорас!");
        Random random = new Random();
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
    public int getLen() {
        return a.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(a);

    }
}
