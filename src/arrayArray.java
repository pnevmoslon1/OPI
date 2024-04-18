import java.util.Random;
import java.util.Scanner;

public class arrayArray extends array_1D{

    private array_1D[] c;


    public arrayArray() {

        Random random = new Random();

        n = super.count;

        for (int i = 0; i < super.count; i++) {
            Random random = new Random();
            c[i] = new array_1D(random.nextInt(1,11));
        }
    }
}
