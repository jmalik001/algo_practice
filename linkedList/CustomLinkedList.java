package linkedList;
public class CustomLinkedList<E> {
  Node<E> head;
  public boolean add(E d){
    addLast(d);
    return true;
  }

  public void addFirst(E e){
    if(head == null){
      head = new Node<>(e);
    }
    Node<E> newNode = new Node<>(e);
    newNode.next = head;
    head = newNode;

  }
  private void addLast(E d) {
    if(head == null){
      head = new Node<>(d);
      return;
    }
    Node<E> current = head;
    while(current.next != null){
      current = current.next;
    }
    current.next = new Node<>(d);
  }

  public void displayData() {
    Node<E> current = head;
    while(current != null){
      System.out.println(current.data);
      current = current.next;
    }
  }
}
