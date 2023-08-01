import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        //우선 순위 queue 
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); 
        for(int num : priorities){
            queue.add(num);
        }
        
        int answer = 0;
        while(!queue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i] == queue.peek()){
                    queue.poll();
                    answer++;
                    if(i == location) return answer;
                }
            }
        }
        return answer;
    }
}