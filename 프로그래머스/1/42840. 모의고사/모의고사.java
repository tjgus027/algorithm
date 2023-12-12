import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5}; //5
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5}; //8
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10
        
        int[] answer = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == first[i%5]) answer[0]++;
            if(answers[i] == second[i%8]) answer[1]++;
            if(answers[i] == third[i%10]) answer[2]++;
        }
        
        // 가장 많이 맞춘 개수
        int maxScore = Math.max(answer[0], Math.max(answer[1], answer[2]));
        
        List<Integer> list = new ArrayList<>();
        
        // 가장 많이 맞춘 사람 담기(오름차순)
        for (int i = 0; i < 3; i++) {
            if (maxScore == answer[i]) list.add(i + 1);
        }
        
        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }
}