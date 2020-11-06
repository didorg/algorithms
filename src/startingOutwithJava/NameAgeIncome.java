package startingOutwithJava;

/*
1. Name, age, and annual income 

Write a program that declares the following: 
    •  a String variable named name 
    •  an int variable named age 
    •  a double variable named annualPay 
Store your age, name, and desired annual income as literals in these variables. The program should display these values on the screen in a manner 
similar to the following: 

My name is Adam, my age is 24 and 
I hope to earn $150000.0 per year.
 */

public class NameAgeIncome {
	public static void main(String[] args) {
		String name = "Adam";
		int age = 24;
		double annualpay = 150000;
		
		System.out.println("My name is "+ name + ", my age is " + age + " and \n I hope to earn $"+ annualpay +" per year.");
	}

}
