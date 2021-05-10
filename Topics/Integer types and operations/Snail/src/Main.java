import java.util.Scanner;
import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var h = scanner.nextInt();
        var a = scanner.nextInt();
        var b = scanner.nextInt();

        var sumHeight = 0;
        var days = 1;
        while (sumHeight + a < h) {
            sumHeight += (a - b);
            days++;
        }
        out.println(days);
    }
}
