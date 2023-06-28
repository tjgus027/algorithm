class Solution {
    public long solution(long n) {
        long answer = 0;
        //루트 n의 값 소수점 절삭하고 정수로 저장
        long num = (long) Math.sqrt(n); //여기서 long대신 int를 쓰면 오버플로우되어 에러 
        
        //루트 n의 제곱이 n이랑 같으면 제곱해서 리턴, 아니면 -1 리턴
        if(n == num*num){
            answer = (long) Math.pow(num+1, 2);
            return answer;
        } else {
            return -1;
        }
    }
}