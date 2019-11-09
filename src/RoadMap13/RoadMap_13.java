package RoadMap13;

import java.util.Arrays;
import java.util.Scanner;

public class RoadMap_13 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов массива");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int massiv[] = new int[a];
        //Присваиваем случайное число
        for (int i = 0; i < a; i++) {

            massiv[i] = (int) (Math.random() * 100);


        }
        System.out.println(Arrays.toString(massiv));

        System.out.println("Сортируем массив");
        Arrays.sort(massiv);
       System.out.println(Arrays.toString(massiv));
        System.out.println("Введите число, которое входит в массив");
        int b = scanner.nextInt();
        int c =RoadMap_13_Method.binarySearch(massiv,b);
        if(c>-1){
            System.out.println("Элемент входит в массив");
        }
        else System.out.println("Элемент не входит в массив");

    }

    }

