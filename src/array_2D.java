import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class array_2D extends array_1D {
    private array_1D[] array2D;

    private int height,weight;
    public array_2D() {}

    public array_2D(int h, int w) {
        height = h;
        weight = w;
        array2D = new array_1D[height];
        Random random = new Random();
        for (int i = 0; i < array2D.length; i++) {
                 array2D[i] = new array_1D(weight);
            for (int j = 0; j < weight; j++) {

                array2D[i].getA()[j] = random.nextInt(1, 15);
            }
        }
    }
    public array_2D(int h) {
        height = h;

        array2D = new array_1D[height];
        Random random = new Random();
        for (int i = 0; i < array2D.length; i++) {
            array2D[i] = new array_1D(random.nextInt(1, 15));
            for (int j = 0; j < array2D[i].getLen(); j++) {

                array2D[i].getA()[j] = random.nextInt(1, 15);
            }
        }
    }





    public void func() {
        int sumFirst = 0;
        int sumSeckond = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < array2D[i].getLen(); j++) {
                if (i < height / 2) sumFirst += array2D[i].getA()[j];
                else sumSeckond += array2D[i].getA()[j];
            }
        }

        int startPos;
        if (sumFirst > sumSeckond) startPos = 0;
        else startPos = height / 2;

        int c;

        for (int i = startPos; i < height / 2 + startPos; i++){
            Arrays.sort(array2D[i].getA());

            for (int j = 0; j < array2D[i].getLen()/2;j++){
                c = array2D[i].getA()[j];
                array2D[i].getA()[j] = array2D[i].getA()[array2D[i].getLen() - j - 1];
                array2D[i].getA()[array2D[i].getLen() - j - 1] = c;
            }
        }
    }


    public int multipleInLargestString(){
        int sum = 0, max = 0, maxI = 0;

        for (int i = 0; i < height; i ++) {
            if (array2D[i].getLen() < max){
                max = array2D[i].getLen();
                maxI = i;
            }
        }
        sum = array2D[maxI].countMultipleFirst();
        return sum;
    }


    public void arrayPrint(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < array2D[i].getLen(); j++) {
                System.out.print(array2D[i].getA()[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
