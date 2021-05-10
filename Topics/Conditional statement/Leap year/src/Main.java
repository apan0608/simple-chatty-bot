import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeapYear = year % 400 == 0 
            || year % 4 == 0 && year % 100 != 0;
            
        System.out.println(isLeapYear ? "Leap" : "Regular");
    }
}
