import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(!list.contains(arr[i])) list.add(arr[i]);
        }
        
        return String.join("", list);
    }
}