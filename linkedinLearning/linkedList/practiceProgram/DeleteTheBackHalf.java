package linkedinLearning.linkedList.practiceProgram;

public class DeleteTheBackHalf {
  public static void main(String[] args){
 CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
    linkedList.add(10);
    linkedList.add(20);
    linkedList.add(30);
    linkedList.add(40);
    linkedList.add(50);
    linkedList.display();
    linkedList.deleteLasthalf();
    linkedList.display();


  }

}
