package day14;

import java.util.HashMap;

public class isomorphic {
    public  static boolean isIsomorphic(String s, String t) {
    if(s.length()!= t.length()) return false;
    HashMap<Character, Character> mapst = new HashMap<>();
    HashMap<Character, Character> mapts = new HashMap<>();
    for(int i = 0; i < s.length(); i++) {
        char c1= s.charAt(i);
        char c2 = t.charAt(i);

        if(mapst.containsKey(c1)){
            if(mapst.get(c1)!=c2) return false;
        }else {
            mapst.put(c1,c2);
        }
        if(mapts.containsKey(c2)){
            if(mapts.get(c2)!=c1) return false;
        }else {
            mapts.put(c2,c1);
        }

     
    }
    return true;
    }
     public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));   // true
        System.out.println(isIsomorphic("foo", "bar"));   // false
        System.out.println(isIsomorphic("paper", "title"));// true
    }
}
