package RoadMap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RoadMap9 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов массива");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int massiv[] = new int[a];
        //Присваиваем случайные числа
        for (int i = 0; i < a; i++) {

            massiv[i] = (int) (Math.random() * 100);

        }
        System.out.println(Arrays.toString(massiv));

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < massiv.length - 1; i++) {
                if (massiv[i] > massiv[i + 1]) {
                    isSorted = false;

                    buf = massiv[i];
                    massiv[i] = massiv[i + 1];
                    massiv[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(massiv));

    }
}
