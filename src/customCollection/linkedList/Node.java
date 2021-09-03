package customCollection.linkedList;

// Node class
public class Node<T> {
  Node next;
  T data;

  public Node() {}

  public Node(T val) {
    data = val;
  }

  public Node(T val, Node next) {
    data = val;
    this.next = next;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
