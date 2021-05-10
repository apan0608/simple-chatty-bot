import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        var arg1 = scanner.nextInt();
        var arg2 = scanner.nextInt();

        var next = arg1;
        while (next <= arg2) {
            out.println(getOutput(next));
            next++;
        }
    }
    
    public static String getOutput(int num) {
        String output = "";
        if (num % 3 == 0 && num % 5 == 0) {
          output = "FizzBuzz";
        } else if (num % 3 == 0) {
          output = "Fizz";
        } else if (num % 5 == 0) {
          output = "Buzz";
        } else {
          output = String.valueOf(num);
        }
        return output;
      }
  }
