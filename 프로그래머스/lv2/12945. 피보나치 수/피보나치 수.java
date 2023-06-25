class Solution {
    public int solution(int n) {
        int[] num = new int[n+1]; //0부터 n까지의 배열이기에 n+1
        num[1] = 1;
        for(int i = 2; i <= n; i++){
            num[i] = (num[i-1] + num[i-2]) % 1234567;
        } 
        int answer = num[n] % 1234567;
        return answer;
    }
}