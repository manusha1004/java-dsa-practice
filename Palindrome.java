import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println(number + " is Not Palindrome");
            sc.close();
            return;
        }

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (original == reverse) {
            System.out.println(original + " is Palindrome");
        } else {
            System.out.println(original + " is Not Palindrome");
        }

        sc.close();
    }
}