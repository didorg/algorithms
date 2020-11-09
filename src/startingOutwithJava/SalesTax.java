package startingOutwithJava;

import java.util.Scanner;

/**
 * Write a program that will ask the user to enter the amount of a purchase.
 * The program should then compute the state and county sales tax.
 * Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
 * The program should display the amount of the purchase, the state sales tax, the county sales tax,
 * the total sales tax, and the total of the sale (which is the sum of the amount of purchase plus the total sales tax).
 *
 * Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent.
 * **/
public class SalesTax {
    public static void main(String[] args) {
        //Variables
        final double STATE_TAX_PERCENTAGE = 0.04;
        final double COUNTY_TAX_PERCENTAGE = 0.02;

        double purchaseAmount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the purchase amount");
        purchaseAmount = scanner.nextDouble();

        // Calculate the county tax
        double countyTax = COUNTY_TAX_PERCENTAGE * purchaseAmount;

        // Calculate the state tax
        double stateTax = STATE_TAX_PERCENTAGE * purchaseAmount;

        // Calculate the total tax
        double totalTax = countyTax + stateTax;

        // Calculate the total sales
        double totalSales = totalTax +purchaseAmount;

        System.out.println("Purchase amount: " + purchaseAmount + "\nState sales tax: " + stateTax +
                "\nCounty sales tax: " + countyTax + "\nTotal tax: " + totalTax + "\n---------------------" +
                "\nTotal Sale: " + totalSales);

    }


}
