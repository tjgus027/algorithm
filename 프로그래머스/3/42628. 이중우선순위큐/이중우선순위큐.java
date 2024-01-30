import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        Queue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> minQueue = new PriorityQueue<>();
        for(String operation : operations){
            int num = Integer.parseInt(operation.substring(2));
            if(operation.startsWith("I")){
                maxQueue.add(num);
                minQueue.add(num);
            } else {
                if(num < 0){
                    maxQueue.remove(minQueue.poll());
                } else {
                    minQueue.remove(maxQueue.poll());
                }
            }
        }
        
        answer[0] = maxQueue.isEmpty() ? 0 : maxQueue.peek();
        answer[1] = minQueue.isEmpty() ? 0 : minQueue.peek();
        
        return answer;
    }
}