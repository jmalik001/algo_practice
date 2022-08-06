package leetcode.arrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
          if (map.get(target-nums[i]) != null){
              return new int[] {map.get(target-nums[i]), i};
          } else {
              map.put(nums[i], i);
          }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] res = twoSum(new int[]{2,7,11,15},9);
        System.out.println(Arrays.toString(res));
    }
}
