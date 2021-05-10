import javax.xml.stream.events.Characters;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var input = scanner.nextLine();
        //System.out.println(input);

        var firstChar = input.charAt(0);
        if (firstChar == 'j' || firstChar == 'J') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}