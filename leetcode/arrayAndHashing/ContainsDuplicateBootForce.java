package leetcode.arrayAndHashing;

public class ContainsDuplicateBootForce {
  // time exceeded on leetcode due to n2
  public static boolean  containsDuplicate(int[] nums) {
    for(int i = 0; i < nums.length; i++) {
      for(int j = i+1; j < nums.length; j++) {
        if (nums[i] == nums[j]){
          return true;
        }
      }
    }
    return false;
  }
  public static void main(String[] args){
    System.out.println(containsDuplicate(new int[] {1,5,6,7,1,8}));
  }

}
