package linkedinLearning.linkedList;

// import java.util.LinkedList;

public class LinkedListAlgo {
  public static void main(String[] args){
   // LinkedList<String> list1 = new LinkedList<>();
//    list1.add("Jaga");
//    list1.addLast("Tusa");
//    list1.addFirst("Shrabs");
//
//    for (String data : list1) {
//      System.out.println("library list -> " + data);
//    }

    CustomLinkedList<Integer> list = new CustomLinkedList<>();
//
//    Node a = new Node(1);
//    Node b = new Node(2);
//    Node c = new Node(3);
//    Node d = new Node(4);
//
//    list.head = a;
//    a.next = b;
//    b.next = c;
//    c.next = d;

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.displayData();
    System.out.println();
    list.addFirst(0);
    list.displayData();
    System.out.println();
    list.addFirst(50);
    list.displayData();

  }

}
