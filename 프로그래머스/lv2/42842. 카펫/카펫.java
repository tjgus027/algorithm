class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int total = brown + yellow;
        for(int i = 3; i <= total; i++){
            int row = i;
            int col = total / row;
            
            if(row > col) continue;
            if((row-2) * (col-2) == yellow){
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }
        return answer;
    }
}