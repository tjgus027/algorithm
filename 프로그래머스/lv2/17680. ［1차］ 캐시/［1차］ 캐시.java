import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length*5;
        
        int answer = 0;
        LinkedList<String> queue = new LinkedList<>();
        
        for(int i = 0; i < cities.length; i++){
            String str = cities[i].toLowerCase();
            //cache hit
            if(queue.remove(str)){
                answer += 1;
                queue.add(str);
            } else { //cache miss
                answer += 5;
                if(queue.size() >= cacheSize){
                    queue.remove(0);
                }
                queue.add(str);
            }
        }
        
        return answer;
    }
}