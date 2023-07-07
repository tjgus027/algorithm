import java.util.*;

class Solution {
    public int[] solution(int n) {
        if(n <= 3) return new int[] {n};
        
        Set<Integer> hs = new HashSet<>();
        
        int num = 2; 
        while(n >= 2){
            if(n%num == 0){
                hs.add(num);
                n /= num;
            } else num++;
        }
        
        return hs.stream().sorted().mapToInt(i -> i.intValue()).toArray();
    }
}