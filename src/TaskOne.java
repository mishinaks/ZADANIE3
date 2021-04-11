import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x = in.nextDouble();
        in.nextLine();
        System.out.println("Enter arithmetic operator (‘+’, ‘-’, ‘*’ or ‘/’): ");
        String sim = in.nextLine();
        System.out.println("Enter the second number: ");
        double y = in.nextDouble();
        double result = 0;
        switch (sim) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default: System.out.println("ERROR");
                return;
        }
        System.out.printf("Result is:  %.4f", result);
    }
}