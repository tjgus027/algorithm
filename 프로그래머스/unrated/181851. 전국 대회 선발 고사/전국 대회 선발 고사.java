import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> realRank = new HashMap<>();
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                realRank.put(rank[i], i);
            }
        }
        List<Integer> key = new ArrayList(realRank.keySet());
        Collections.sort(key);
        
        int[] pick = new int[3];
        
        for(int i = 0; i < pick.length; i++){
            pick[i] = realRank.get(key.get(i));
        }
        
        return (pick[0] * 10000) + (pick[1] * 100) + pick[2];
    }
}