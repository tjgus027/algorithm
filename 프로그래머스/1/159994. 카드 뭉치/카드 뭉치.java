import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int indexOfCard1 = 0;
        int indexOfCard2 = 0;
        
        for(int i = 0; i < goal.length; i++){
            if(indexOfCard1 < cards1.length && goal[i].equals(cards1[indexOfCard1])){
                indexOfCard1++;
                continue;
            }
            
            if(indexOfCard2 < cards2.length && goal[i].equals(cards2[indexOfCard2])){
                indexOfCard2++;
                continue;
            }
            
            return "No";
        }
        return "Yes";
    }
}