import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> score = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            score.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            int total = 0; 
            for(int j = 0; j < photo[i].length; j++){
                total += (score.containsKey(photo[i][j])) ? score.get(photo[i][j]) : 0;
            }
            answer[i] = total;
        }
        
        return answer;
    }
}