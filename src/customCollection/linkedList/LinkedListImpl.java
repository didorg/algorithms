package customCollection.linkedList;


import java.util.Arrays;

public class LinkedListImpl {
    // Test code - main function
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addLast(8);
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addLast(11);

        System.out.println("linkedList size is: " + linkedList.getSize());
        linkedList.printLinkedList();
    }
}
