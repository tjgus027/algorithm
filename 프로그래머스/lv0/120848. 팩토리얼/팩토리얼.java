class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 10; i > 0; i--){
            if(n >= factorial(i)){
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    //팩토리얼 메소드
    public int factorial(int num){
        if(num <= 1) return 1;
        else return factorial(num-1) * num;
    }
}