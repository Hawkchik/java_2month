import java.util.Scanner;

public class Road_map3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String b = scanner.nextLine();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == b.charAt(0)) {
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb.toString());
    }
}
