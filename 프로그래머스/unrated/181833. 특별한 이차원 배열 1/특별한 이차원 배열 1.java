class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        // for(int i = 0, j = 0; i < n; i++, j++){
        //     if(i==j) answer[i][j] = 1;
        // }
        
        //다른 사람 코드
        for(int i = 0; i < n; i++){
            answer[i][i] = 1;
        }
        return answer;
    }
}