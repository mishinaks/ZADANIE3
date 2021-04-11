import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
}
