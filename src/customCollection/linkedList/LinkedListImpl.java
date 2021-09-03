package customCollection.linkedList;

public class LinkedListImpl {
    // Test code - main function
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll.getSize());
        ll.add(8);
        System.out.println(ll.getSize());
        ll.add("String");
        ll.add(5);
        ll.add(10);
        System.out.println(ll.find("String").getData());
        ll.remove(5);
        System.out.println("Size is " + ll.getSize());
        System.out.println(ll.find(5));
    }
}
