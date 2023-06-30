class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for(int i = k, j = 0; i <= n; i = i+k, j++){
            answer[j] = i;
        }
        return answer;
    }
}