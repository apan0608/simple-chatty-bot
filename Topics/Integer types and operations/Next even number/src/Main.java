import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int nextNumber = 0;
        if (number > 10_000) {
            return;
        }
        if (number % 2 == 0) {
            nextNumber = number + 2;
            
        } else {
            nextNumber = number + 1;
        }
        System.out.print(nextNumber);
    }
}
