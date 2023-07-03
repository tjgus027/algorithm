class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n, k);
        String[] arr = str.split("[0]+");
        
        for(String s: arr){
            long num = Long.parseLong(s);
            if(isPrime(num)){
                answer++;
            }
        }
        return answer;
    }
    
    //소수 판별 메서드
    public boolean isPrime(long number){
        if(number < 2) return false;
        
        for(int i = 2; i <= (int)Math.sqrt(number); i++){
            if(number%i == 0) return false;
        }
        return true;
    }
}