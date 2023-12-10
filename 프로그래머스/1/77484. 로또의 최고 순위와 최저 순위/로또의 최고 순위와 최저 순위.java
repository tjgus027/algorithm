import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] prize = {6, 6, 5, 4, 3, 2, 1};
        
        int zeroCount = 0;
        int hit = 0;
        
        for(int lotto : lottos){
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            
            for(int i = 0; i < win_nums.length; i++){
                if(lotto == win_nums[i]){
                    hit++;
                } 
            }
        }
        
        return new int[]{prize[hit+zeroCount], prize[hit]};
    }
}