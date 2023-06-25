import java.util.*;
class Solution {
    boolean solution(String s) {
        String sd = s.toLowerCase();
        String[] sArr = sd.split("");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String key : sArr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        System.out.println("Hello Java");

        return (map.get("p") == map.get("y"));
    }
}