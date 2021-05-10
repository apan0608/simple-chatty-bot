import java.util.Scanner;

import static java.lang.System.out;

import static java.lang.System.in;

class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var first = scanner.nextLine();
        var second = scanner.nextLine();

        first = first.replace(" ", "");
        second = second.replace(" ", "");

        out.println(first.equals(second));

    }
}