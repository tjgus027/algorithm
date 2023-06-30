class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2 != 0 && b%2 != 0){
            answer += Math.pow(a, 2);
            answer += Math.pow(b, 2);
            return answer;
            
        } else if(a%2 != 0 || b%2 != 0){
            return 2*(a+b);
            
        } else {
            return Math.abs(a-b);
        }
    }
}