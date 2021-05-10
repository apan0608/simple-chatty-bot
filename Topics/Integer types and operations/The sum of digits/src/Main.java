import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int number = scanner.nextInt();;

        int tensPlace = number % 100;
        int unitPlace = tensPlace % 10;

        System.out.println(number / 100 + tensPlace / 10 + unitPlace);

    }
}