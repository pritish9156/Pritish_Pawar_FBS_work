/*Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30% respectively.
DA (Dearness Allowance)  TA (Travel Allowance)  HRA (House Rent Allowance)*/

public class Q7 {
    public static void main(String[] args) {
        // variable declaration and initialization
        int basicSal = 12839;
        float da, ta, hra, totalSal, daPercentage, taPercentage, hraPercentage;

        // applying logic
        if (basicSal <= 5000) {
            // storing percentages in different variables to use on the output screen
            daPercentage = 0.10f;
            taPercentage = 0.20f;
            hraPercentage = 0.25f;

            // calculating da, ta, and hra according to the condition
            da = basicSal * daPercentage;
            ta = basicSal * taPercentage;
            hra = basicSal * hraPercentage;
        } else {
            daPercentage = 0.15f;
            taPercentage = 0.25f;
            hraPercentage = 0.30f;

            da = basicSal * daPercentage;
            ta = basicSal * taPercentage;
            hra = basicSal * hraPercentage;
        }

        // calculating total salary
        totalSal = basicSal + da + ta + hra;

        // printing output
        System.out.println("Salary Slip : ");
        System.out.println("______________________________");
        System.out.println("\nBasic Salary: " + basicSal + "rs");
        System.out.println("Dearness Allowance(" + (daPercentage * 100) + "%): " + da + "rs");
        System.out.println("Travel Allowance(" + (taPercentage * 100) + "%): " + ta + "rs");
        System.out.println("House Rent Allowance(" + (hraPercentage * 100) + "%): " + hra + "rs");
        System.out.println("---------------------------------------");
        System.out.println("Total Cost to Company: " + totalSal + "rs");
        System.out.println("---------------------------------------");
    }
}


