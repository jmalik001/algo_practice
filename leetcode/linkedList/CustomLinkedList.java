package leetcode.linkedList;

public class CustomLinkedList<E> {
  Node<E> head;

  public void dispaly (){
    Node<E> current = head;
    System.out.println("head" + head);
    while(current != null){
      System.out.println();
      System.out.print("Address"+ current + " | Data " +current.data+"->");

      current = current.next;
    }
  }

  public void add(E data) {
    if (head == null) {
      head = new Node(data);
    } else {
      Node<E> current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new Node(data);
    }
  }

  public void reverseTheList() {
    Node<E> current = head;
    Node<E> prev = null;

    while(current != null){

      Node<E> next = current.next;
      current.next = prev;
      prev = current;

      current = next;

    }
    head = prev;
  }

  public static class Node<E> {
    public E data;
    public Node<E> next;

    public Node(E d){
      data = d;
    }
  }

}
