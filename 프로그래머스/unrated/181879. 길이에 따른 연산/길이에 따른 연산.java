class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length > 10){
            for(int n: num_list) answer += n;
            answer--;
        } else {
            for(int n: num_list) answer *= n;
        }
        return answer;
    }
}