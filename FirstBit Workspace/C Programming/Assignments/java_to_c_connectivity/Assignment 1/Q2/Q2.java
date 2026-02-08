//Write a program to check given 3 digit number is pallindrome or not.

public class Q2 {
    public static void main(String[] args) {
        // variable declaration and initialization
        int digit = 313;
        int firstDigit, lastDigit;

        // extracting first and last digit from given digit
        firstDigit = digit / 100;
        lastDigit = digit % 10;

        // checking extracted digits were equal or not
        if (firstDigit == lastDigit)
            System.out.println(digit + " is a palindrome number");
        else
            System.out.println(digit + " is not a palindrome number");
    }
}
