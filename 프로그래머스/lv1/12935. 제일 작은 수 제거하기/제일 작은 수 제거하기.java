import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[]{-1};
        
        //가장 작은 수 
        int min = arr[0];
        for(int n: arr){
            if(min > n) min = n;
        }
        
        //작은 수 제외 list에 담음
        List<Integer> list = new ArrayList<>();
        for(int n : arr){
            if(min != n) list.add(n);
        }
        
        //list 배열로 옮겨 닮음
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}