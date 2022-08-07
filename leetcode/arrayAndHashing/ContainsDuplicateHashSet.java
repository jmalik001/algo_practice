package leetcode.arrayAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateHashSet {
  //
  public static boolean  containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (!set.add(num))
        return true;
    }
    return false;
  }
  public static void main(String[] args){
    System.out.println(containsDuplicate(new int[] {1,5,6,1,7,8}));
  }

}
