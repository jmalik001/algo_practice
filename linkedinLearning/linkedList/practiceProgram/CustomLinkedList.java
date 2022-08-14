package linkedinLearning.linkedList.practiceProgram;

public class CustomLinkedList<E> {

  public Node<E> head;
  public Node<E> last;

  public void deleteLasthalf() {
    Node<E> slowPointer = head;
    Node<E> fastPointer= head; // move twice
   Node<E> midPrev = null ; // just previous of slow node so including the middle node we can delete
    if (head == null || head.next == null){
    head = null;
    }
    while(fastPointer != null && fastPointer.next != null){
      fastPointer= fastPointer.next.next;
      midPrev = slowPointer;
      slowPointer= slowPointer.next;

    }
    System.out.println();
    System.out.println(slowPointer.data);
    System.out.println(fastPointer.data);
   //  slowPointer.next = null;
    midPrev.next = null;

  }

  public static class Node<E> {
  public E data;
  public Node<E> next;
  public Node(E d){
    this.data = d;
  }
  }

  public void display(){
  if (head == null){
    System.out.println("no data");
  }else{
    Node<E> current = head;
    while(current != null){
      System.out.print(current.data+ "->");
      current= current.next;

    }
  }

  }

  public void linkLast (E d){
  Node<E> newNode = new Node<>(d);

    if(head == null){
      head = newNode;
    }else {
      last.next = newNode;
    }
    last=newNode;

  }
  public boolean add (E d){
    linkLast(d);
    return true;
  }

}
