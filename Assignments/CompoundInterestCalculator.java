import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = sc.nextDouble();

        System.out.println("Enter the annual interest rate (in percentage):");
        double rate = sc.nextDouble();

        System.out.println("Enter the number of times interest is compounded per year:");
        int timesCompounded = sc.nextInt();

        System.out.println("Enter the time the money is invested or borrowed for (in years):");
        double time = sc.nextDouble();

        // A = P(1 + r/n)^(nt)
        double compoundInterest = principal * Math.pow((1 + (rate / 100) / timesCompounded), timesCompounded * time);

        double interestEarned = compoundInterest - principal;

        System.out.println("The compound interest accrued on the principal amount " + principal + " is: " + interestEarned);
        System.out.println("The total amount after " + time + " years is: " + compoundInterest);

        sc.close();
    }
}