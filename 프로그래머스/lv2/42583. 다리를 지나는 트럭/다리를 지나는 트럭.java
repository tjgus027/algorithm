import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> que = new LinkedList<>();
        int sum = 0; 
        int answer = 0;
        for(int i = 0; i < truck_weights.length; i++){
            int truck = truck_weights[i];
            
            while(true){
                if(que.isEmpty()){
                    que.add(truck);
                    sum += truck;
                    answer++;
                    break;
                } else if(que.size() == bridge_length){
                    sum -= que.poll();
                } else {
                    if(sum + truck <= weight){
                        que.add(truck);
                        sum += truck;
                        answer++;
                        break;
                    } else{
                        que.add(0);
                        answer++;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}