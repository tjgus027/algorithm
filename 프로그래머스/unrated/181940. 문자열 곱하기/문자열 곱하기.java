class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
        /*다른 사람 풀이 참고
        return my_string.repeat(k);
        */
    }
}
