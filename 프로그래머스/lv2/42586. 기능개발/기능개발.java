import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[progresses.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
	    	arr[i] = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i] != 0) {
                arr[i] += 1;
            }
	    }
        int x = arr[0];
        int count = 1; 
	        for(int i = 1; i < arr.length; i++){
	            if(x >= arr[i]) {
	            	count++;
	            } else {
	                list.add(count);
	                count = 1;
                    x = arr[i];
	            } 
	        }
        list.add(count);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}