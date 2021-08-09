package basics;

public class DataTypes {
    public static void main(String[] args) {

        /** Primitive data types **/
        // 1 byte;
        byte theByte = -128;

        // 2 bytes;
        short theShort = 8_989;

        // 4 bytes;
        int theInt = 789_542_554;

        // 4 bytes;
        float pi = 3.14F;

        // 8 bytes;
        double piDouble = 3.14;

        // 8 bytes;
        long theLong = 54845454L;

        //1 bit;
        boolean isAdult = true;

        // 2 bytes
        char nameInitial = 'A';

        System.out.println("The initial Name is "+nameInitial+"\nThe short is "+theShort + "\nThe int is "+theInt);


        /** Non primitive data types AKA Reference types */
        // All the variables provided by Java (other than the eight primitive variables mentioned above) are reference type
        String name = "Adam";
        System.out.println(name);

        /**
         * The value of a primitive variable is concrete, whereas the value of a reference variable is a reference
         * - primitive variable causes the computer to reserve some memory where the value assigned to the variable can be stored
         * - any object instanced from a class is a reference variable
         * **/

    }
}
