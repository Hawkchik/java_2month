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

    // Метод логики, надо будет подумать
    public int comeBack() {
        Random random = new Random();
        boolean chanceoftrue = false;
        Random k = random;
        int c = array[0];
        for (int i = 0; i < array2.length - 1; i++) {
            int m = Arrays.stream(array2).sum();// Общая вероятность
           // System.out.println(m);
            int b = array2[i];
            if (chanceoftrue =(int) (Math.random()*100)+(10*m-b) <=(m*10))
            {
                return array[i];
            }
        }

        return c;
    }

}
