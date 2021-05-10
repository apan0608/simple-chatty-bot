import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(in);
        var n = scanner.nextInt();

        var parts = new int[] {0, 0, 0};
        int count = 1;
        while (count <= n) {
            int part = scanner.nextInt();
            if (part == 0) {
                parts[0]++;
            } else if (part == 1) {
                parts[1]++;
            } else if (part == -1) {
                parts[2]++;
            }
            count++;
        }
        out.println(String.format("%d %d %d", parts[0], parts[1], parts[2]));
    }
}