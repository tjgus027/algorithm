class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int lastNum = num_list[num_list.length-1];
        int num = num_list[num_list.length-2];
        
        if(lastNum > num){
            for(int i = 0; i < num_list.length; i++){
                answer[i] = num_list[i];
            } 
            answer[answer.length-1] = lastNum-num;
        } else {
            for(int i = 0; i < num_list.length; i++){
                answer[i] = num_list[i];
            } 
            answer[answer.length-1] = lastNum*2;
        }
        return answer;
    }
}