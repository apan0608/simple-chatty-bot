import java.util.Scanner;
import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var sumOfTales = 0;
        for (int i = 0; i < 3; i++) {
            var students = scanner.nextInt();
            var tablesRequired = students % 2 == 0
                    ? students / 2
                    : students / 2 + 1;
            sumOfTales += tablesRequired;
        }
        out.println(sumOfTales);
    }
}