//Write a program to check whether a given character is a vowel or consonant.
//(vowel - a,e,i,o,u,A,E,I,O,U others are consonant)

public class Q4 {
    public static void main(String[] args) {
        // variable initialization
        char ch = 'A';

        // applying condition
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
            System.out.println(ch + " is a vowel");
        else
            System.out.println(ch + " is a consonant");
    }
}


