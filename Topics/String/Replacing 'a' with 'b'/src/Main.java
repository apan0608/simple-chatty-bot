import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var input = scanner.nextLine();

        if (input != null) {
            for (var c : input.toCharArray()) {
                var result = c == 'a' ? 'b' : c;
                System.out.print(result);
            }
        }
    }
}
