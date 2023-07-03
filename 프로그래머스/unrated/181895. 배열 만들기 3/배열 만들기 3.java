class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int len = (intervals[0][1] - intervals[0][0]) + (intervals[1][1] - intervals[1][0]) + 2;
        
        int idx = 0;
        int[] answer = new int[len];
        
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++){
            answer[idx++] = arr[i];
        }
        
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++){
            answer[idx++] = arr[i];
        }
        return answer;
    }
}