class Solution {
    public String solution(String[] arr) {
        //내가 쓴 정답
        String answer = "";
        for(String s : arr){
            answer += s;
        }
        return answer;
        
        /*다른 사람 풀이 참고
        return String.join("", arr);
        */
    }
}
