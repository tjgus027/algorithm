class Solution {
    public int[] solution(int n, int m) {
        int gcd = 0;
        
        int max = (n > m) ? n : m;
        int min = (max == n) ? m : n;
        
        gcd = getGCD(max, min);
        
        return new int[] {gcd, (n*m)/gcd};
    }
    
    //유클리드 호제법 - 재귀
    public int getGCD(int num1, int num2){
        if(num1 % num2 == 0){
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}