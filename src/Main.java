import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        boolean end = true;
        double first = 0;
        double second = 0;
        String operation;
        Scanner scan = new Scanner(System.in);
        while(end) {
            try {
                System.out.print("Type of of Operation(End to quit): ");
                operation = scan.next().toLowerCase();

                if(!operation.equals("end")) {
                    System.out.print("\nFirst number: ");
                    first = scan.nextInt();

                    if (!operation.equals("!")) {
                        System.out.print("\nSecond Number: ");
                        second = scan.nextInt();
                    }
                }

                switch (operation) {
                    case "+" : System.out.println(first + second); break;
                    case "-" : System.out.println(first - second); break;
                    case "x" : System.out.println(first * second); break;
                    case "/" : System.out.println(first / second); break;
                    case "!" : System.out.println(factorial(first)); break;
                    case "end" : end = false; break;
                    default:
                        System.out.println("Not a valid operation");
                }
            }
            catch (InputMismatchException ex) {
                System.out.println("Needs a number");
            }
        }
    }

    public static double factorial(double num) {
        if(num <= 0)
            return 1;
        return num * factorial(num - 1);
    }
}
