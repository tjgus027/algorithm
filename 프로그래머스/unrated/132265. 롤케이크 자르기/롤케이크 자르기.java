import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> cake = new HashMap<>();
        HashSet<Integer> rollcake = new HashSet<>();
        
        rollcake.add(topping[0]);
        for(int i = 1; i < topping.length; i++){
            cake.put(topping[i], cake.getOrDefault(topping[i], 0)+1);
        }
        
        for(int i = 1; i < topping.length; i++){
            rollcake.add(topping[i]);
            cake.put(topping[i], cake.get(topping[i])-1);
            if(cake.get(topping[i]) == 0) {cake.remove(topping[i]);}
            if(cake.size() == rollcake.size()) answer++;
        }
        
        return answer;
    }
}