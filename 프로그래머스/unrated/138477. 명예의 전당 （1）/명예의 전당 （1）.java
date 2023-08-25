import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> que = new PriorityQueue<>();
        for(int i = 0; i < score.length; i++){
            que.add(score[i]);
            if(i >= k) que.poll();
            answer[i] = que.peek();
        }
        return answer;
    }
}