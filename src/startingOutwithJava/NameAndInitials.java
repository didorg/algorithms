package startingOutwithJava;

/**
 * Write a program that has the following String variables: firstName, middleName, and lastName.
 * Initialize these with your first, middle, and last names.
 * The program should also have the following char variables:
 * firstInitial, middleInitial, and lastInitial. Store your first, middle, and last initials in these variables.
 * The program should display the contents of these variables on the screen.
 * **/

public class NameAndInitials {
    public static void main(String[] args) {
        String firstName = "Adam";
        String lastName = "Poe";
        String middleName = "Cruz";

        char firstInitial = 'A';
        char middleInitial = 'C';
        char lastInitial = 'P';

        System.out.println("My name is "+ firstName + ", my last name is " + lastName + " and my  middle name is " + middleName);
        System.out.println("Initials: " +firstInitial + "."+lastInitial + "."+middleInitial);

    }
}
