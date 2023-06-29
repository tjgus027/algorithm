class Solution {
    public int solution(long num) { //여기를 int로 놓고 풀면 오버플로우 발생해서 3번 에러
        int answer = 0;
        
        while(num != 1){
            num = (num%2 == 0) ? num/2 : num*3 + 1;
            answer++;
            
            if(answer >= 500) return -1;
        }
        
        return answer;
    }
}