import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int numberTask = in.nextInt();
        if (numberTask == 1){
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
            return;
        }
        else if(numberTask == 2){
            System.out.println("Enter the size of the array:");
            int sizeArray = in.nextInt();
            in.nextLine();
            String[] str = new String[sizeArray];
            for (int i = 0; i < sizeArray; i++) {
                System.out.println("Enter the string:");
                str[i] = in.nextLine();
            }
            int [] quantitySim = new int[sizeArray];
            for (int i = 0; i < sizeArray; i++) {
                quantitySim[i] = str[i].length();
            }
            int max = 0;
            for (int i = 0; i < sizeArray; i++) {
                max = Math.max(quantitySim[i], max);
            }
            for (int i = 0; i < sizeArray; i++) {
                if (quantitySim[i] == max) {
                    System.out.println("Тhe longest word is " + str[i]);
                    return;
                }
            }
        }
        else {
            System.out.println("ERROR");
            return;
        }
    }
}