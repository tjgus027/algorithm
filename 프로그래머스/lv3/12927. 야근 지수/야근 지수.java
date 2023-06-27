import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        //전체 일의 양 
        int sum = 0;
        for(int w : works) sum += w;
        
        if(n >= sum) return 0;
        
        while(n != 0){
            int max = 0;
            for(int w : works){
                if(w > max) max = w;
            }
            for(int i = 0; i < works.length; i++){
                if(works[i] == max){
                    works[i]--;
                    n--;
                    if(n==0) break;
                }
            }
        }
        
        for(int w : works){
            answer += w*w;
        }
        
        return answer;
    }
}