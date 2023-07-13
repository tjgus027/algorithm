import java.util.*;

class Solution {
    public int[] solution(String msg) {
        //set에 A~Z 담기
        Map<String, Integer> hm = new HashMap<>();
        int index = 1;
        for(int i = 65; i < 91; i++){
            char c = (char) i;
            hm.put(c+"", index++);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < msg.length(); i++){
            int idx = 0; 
            String str = "";
            for(int j = i+1; j <= msg.length(); j++){
                str += msg.substring(i,j);
                if(hm.containsKey(str)){
                    idx = hm.get(str);
                    if(j == msg.length()){
                        i = j;
                    }
                    continue;
                } else{
                    i = j-2; 
                    break;
                }
            }
            hm.put(str, index++);
            list.add(idx);
        }
        
        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }
}