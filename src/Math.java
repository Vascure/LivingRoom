import java.util.Scanner;

public class Math {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Number ");
        int firstNumber = scanner.nextInt();
        int secondNumber = 3;

        int result = firstNumber % secondNumber;

        if (result == 0) {
            System.out.println("The number is durch 3 Teilbar");

        } else System.out.println("The Number is not durch 3 teilbar");
    }
}
