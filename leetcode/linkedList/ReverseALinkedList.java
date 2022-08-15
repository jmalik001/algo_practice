package leetcode.linkedList;

public class ReverseALinkedList {

  public static void main(String[] args) {
    CustomLinkedList<Integer> list = new CustomLinkedList();
    list.add(15);
    list.add(16);
    list.add(17);
    list.add(18);
    list.dispaly();
    list.reverseTheList();
    list.dispaly();

  }

}
