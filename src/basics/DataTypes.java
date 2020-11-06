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
        // 8 bytes;
        long theLong = 54845454L;

        // 4 bytes;
        float pi = 3.14F;
        // 8 bytes;
        double piDouble = 3.14;

        //1 bit;
        boolean isAdult = true;
        // 2 bytes
        char nameInitial = 'A';

        System.out.println("The initial Name is "+nameInitial+"\nThe short is "+theShort + "\nThe int is "+theInt);
    }
}
