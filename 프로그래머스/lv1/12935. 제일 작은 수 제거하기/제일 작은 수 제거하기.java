import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1 || arr.length == 0) return new int[]{-1};
        
        int min = arr[0];
        for(int n: arr){
            if(min > n) min = n;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int n : arr){
            if(min != n) list.add(n);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}