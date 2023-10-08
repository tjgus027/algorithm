class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        if(row > col){
            int[][] answer = new int [row] [row];
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else if(col > row){
            int[][] answer = new int [col][col];
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else{
            return arr;
        }
    }
}