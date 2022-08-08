package leetcode.arrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
  public static boolean isAnagram(String s, String t) {
    System.out.println(s.length() + "--" + t.length());
    if(s.length() != t.length()) return  false;
    Map<Character,Integer> sMap = new HashMap<>();
    Map<Character,Integer> tMap = new HashMap<>();

    char[] sChar = s.toCharArray();
    char[] tChar = t.toCharArray();
    for(int i = 0; i < s.length(); i++) {
      sMap.put(sChar[i], sMap.getOrDefault(sChar[i], 0) + 1);
      tMap.put(tChar[i], tMap.getOrDefault(tChar[i], 0) + 1);
    }
    for(int i = 0; i < sChar.length; i++) {
      if (sMap.get(sChar[i]) != tMap.getOrDefault(sChar[i],0)) return false;
    }

    return true;
  }
public static void main(String[] args){
  System.out.println(isAnagram("rat", "car"));
}
}
