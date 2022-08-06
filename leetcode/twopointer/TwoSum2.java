package leetcode.twopointer;

import java.util.Arrays;

public class TwoSum2 {
  public static  int[] twoSum(int[] numbers, int target) {
    int leftPointer = 0;
    int rightPointer = numbers.length-1;

    while (leftPointer < rightPointer){
      if (numbers[leftPointer] + numbers[rightPointer] == target){
        return new int[]{leftPointer+1, rightPointer+1};
      }
      if(numbers[leftPointer] + numbers[rightPointer] > target){
        rightPointer --;
      }else if(numbers[leftPointer] + numbers[rightPointer] < target){
       leftPointer++;
      }
    }

    return new int[]{};
  }
  public static void main(String[] args){
    System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)) );
  }
}
