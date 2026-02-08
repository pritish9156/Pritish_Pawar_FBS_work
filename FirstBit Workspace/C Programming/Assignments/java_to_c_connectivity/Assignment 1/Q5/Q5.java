//Write a program to check whether a person is eligible to vote (age >= 18).

public class Q5 {
    public static void main(String[] args) {
        // variable initialization
        int age = 17;

        // applying condition
        if (age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote - Your age is " + age + " years old\nAge must be at least 18 years old to be eligible.");
    }
}

