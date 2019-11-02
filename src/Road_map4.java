import java.util.Arrays;
import java.util.Scanner;

public class Road_map4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = new int[a];

        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }

        int c = 0;
        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                break;
            }
            if (b[i] == b[i + 1]&& b[i]<b.length-1&& b[i+1] <b.length-1&& b[i]>0&&b[i+1]>0){
                c = b[i];
                i++;

            }
            System.out.println(c);

        }
        System.out.println(Arrays.toString(b));


    }
}
