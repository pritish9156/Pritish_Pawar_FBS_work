//Write a program to check whether a given character is uppercase or lowercase.

public class Q6 {
    public static void main(String[] args) {
        // variable initialization
        char ch = 'a';

        // applying condition
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Given character -> (" + ch + ") is an Uppercase character");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Given character -> (" + ch + ") is a lowercase character");
        else
            System.out.println("Not a valid character Input please try again.");
    }
}
