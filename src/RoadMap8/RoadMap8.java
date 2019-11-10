package RoadMap8;

import java.util.Arrays;
import java.util.Scanner;

public class RoadMap8 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов массива");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int massiv[] = new int[a];
        //Присваиваем случайные числа
        for (int i = 0; i < a; i++) {

            massiv[i] = (int) (Math.random() * 100);

        }
        Arrays.sort(massiv);

        int min=massiv[0];
        int avg=massiv[(massiv.length-1)/2];
        int max=massiv[massiv.length-1];

        System.out.println(min + " "+ avg +" "+max);

        System.out.println(Arrays.toString(massiv));

       // System.out.println(max);


    }
}
