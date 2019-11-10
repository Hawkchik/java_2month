package RoadMap7;

import java.util.Arrays;
import java.util.Scanner;

public class RoadMap7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a;
        int array[] = new int[a];
        int array2[] = new int[b];
        //Присваиваем случайное число
        for (int i = 0; i < a; i++) {

            array[i] = (int) (Math.random() * +100);
        }
        System.out.println(Arrays.toString(array));

        //Присваиваем вес
        for (int i = 0; i < a; i++) {

            array2[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array2));


        Methods methods = new Methods(array, array2);
        System.out.println(methods.comeBack());


    }
}