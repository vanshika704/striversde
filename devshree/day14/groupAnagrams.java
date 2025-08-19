package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
     public static List<List<String>> brute(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
     } 


     public static List<List<String>> optimal (String []strs){
       
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // build key like "a1e1t1"
            StringBuilder keyBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    keyBuilder.append((char)(i + 'a')).append(count[i]);
                }
            }
            String key = keyBuilder.toString();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    
     }
      public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(brute(words));
          System.out.println(optimal(words));
    }
}
