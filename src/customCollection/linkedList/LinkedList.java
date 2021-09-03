package customCollection.linkedList;

public class LinkedList<T> {
    Node head;
    int size;

    public LinkedList() {
        head = new Node();
        size = 0;
    }

    public void setSize(int s) {
        this.size = s;
    }

    public int getSize() {
        return this.size;
    }

    public Node add(T data) {
        Node newNode = new Node(data, head);
        this.head = newNode;
        this.size++;
        return newNode;
    }

    public Node find(T data) {
        Node thisNode = this.head;

        while (thisNode != null) {
            if (thisNode.getData() == data)
                return thisNode;
            thisNode = thisNode.getNext();
        }
        return null;
    }

    public boolean remove(T data) {
        Node thisNode = this.head;
        Node prevNode = null;

        while (thisNode != null) {
            if (thisNode.getData() == data) {
                if (prevNode != null)
                    prevNode.setNext(thisNode.getNext());
                else
                    this.head = null;
                this.setSize(this.getSize() - 1);
                return true;
            }
            prevNode = thisNode;
            thisNode = thisNode.getNext();
        }
        return false;
    }
}
