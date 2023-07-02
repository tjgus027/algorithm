class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int idx = 0;
        for(int i = n; i < num_list.length; i++){
            answer[idx++] = num_list[i];
        }
        
        idx = 0;
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == 0){
                answer[i] = num_list[idx++];
            }
        }
        return answer;
    }
}