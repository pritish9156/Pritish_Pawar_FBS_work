//Write a program to check whether a given year is a leap year.

public class Q3 {
    public static void main(String[] args) {
        // variable initialization
        int year = 2000;

        // checking for leap year
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
