import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(in);
        int start = scanner.nextInt();
        int finish = scanner.nextInt();

        double sum = 0;
        int occurrence = 0;
        for (int i = start; i <= finish;) {
            if (i % 3 == 0) {
                occurrence++;
                sum += i;
                i += 3;
            } else {
                i++;
            }
        }
        out.println(sum / occurrence);
    }
}