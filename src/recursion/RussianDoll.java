package recursion;

public class RussianDoll {

    public static void main(String[] args) {
        openRussianDoll(5);
    }

    static void openRussianDoll(int doll){
        if (doll == 1) System.out.println("Doll 1 is opened and all Doll are opened");
        else {
            System.out.println("Doll "+ doll + " opened");
            openRussianDoll(doll -1 );
        }
    }
}
