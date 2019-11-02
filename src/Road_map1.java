import java.util.Arrays;
import java.util.Scanner;

public class Road_map1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] c = new int[6];

        for (int i = 0; i < 6; i++) {
            c[i] = scanner.nextInt();
        }


        int a;

        // Без 3 переменной

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5 - i; k++) {
                if (c[k] > c[k + 1]) {
                    a = c[k];
                    c[k] = c[k + 1];
                    c[k + 1] = a;
                }

            }
        }
        System.out.println(Arrays.toString(c));
    }


}

