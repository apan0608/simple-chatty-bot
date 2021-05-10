import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean breakable = n * m > k
                && (k % n == 0 || k % m == 0);
        out.println(breakable ? "YES" : "NO");
    }
}