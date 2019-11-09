package RoadMap11;

import java.util.Arrays;
import java.util.Scanner;

public class RoadMap11 {
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

    }
}
