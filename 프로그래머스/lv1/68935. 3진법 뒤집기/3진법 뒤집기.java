class Solution {
    public int solution(int n) {
        String to3 = Integer.toString(n, 3);
        
        String reverse = "";
        for(int i = to3.length()-1; i >= 0; i--){
            reverse += to3.charAt(i);
        }
        
        return Integer.parseInt(reverse, 3);
    }
}