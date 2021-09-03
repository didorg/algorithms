package customCollection.linkedList;

public class LinkedList<T> {
    Node head;
    int size;

    public LinkedList() {
        this.head = null;
    }

    public void addFirst(T data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(T data) {
        if (this.head == null) addFirst(data);
        else {
            Node node = new Node();
            node.data = data;
            node.next = null;
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public void printLinkedList() {
        if (this.size == 0) {
            System.out.println("LinkedList is Empty");
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                System.out.print(tmp.data +" -> ");
                tmp = tmp.next;
            }
            System.out.print(tmp.data.toString());
        }
    }
}
