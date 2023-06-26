class Solution {
    public int solution(int a, int b) {
        String str = Integer.toString(a) + Integer.toString(b);
        int num1 = Integer.parseInt(str);
        int num2 = 2*a*b;
        
        if(num1 >= num2){
            return num1;
        } else {
            return num2;
        } 
        
    }
}