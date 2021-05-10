import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
    
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        
    }
}
