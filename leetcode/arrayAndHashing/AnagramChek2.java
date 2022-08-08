package leetcode.arrayAndHashing;

import java.util.Arrays;

public class AnagramChek2 {
  public static boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) return  false;
    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();

    Arrays.sort(sChars);
    Arrays.sort(tChars);
    if(!Arrays.equals(sChars, tChars)) return false;
    return true;
  }
  public static void main(String[] args){
    System.out.println(isAnagram("rat", "tar"));
  }
}
