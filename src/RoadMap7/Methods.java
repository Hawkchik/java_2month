package RoadMap7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Methods {
    Scanner scanner = new Scanner(System.in);

    int array[]; // 1 массив
    int array2[]; // 2 массив весов

    public Methods(int[] array, int[] array2) {
        this.array = array;
        this.array2 = array2;
    }
    // конструктор

    // Метод логики, надо будет подумать, надо будет сделать через 3 цикла....
    //Шинанду
    public int comeBack() {

        int c = array[array.length - 1];
        int m = Arrays.stream(array2).sum();
        //System.out.println(m);


        for (int i = 0; i < array2.length - 1; i++) {

            int b = array2[i];
            int p = (int) ((Math.random() * m));
            if (p >= m - b) {
                return array[i];
            }
        }

        return c;
    }

}
