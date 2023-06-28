class Solution {
    public int solution(int n) {
        if(n == 1 || n == 0) return n; 
        
        int answer = n+1;
        for(int i = 2; i < n; i++){
            if(n%i == 0) answer += i;
        }
        return answer;
    }
}