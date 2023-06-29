class Solution {
    public boolean solution(int x) {
        int mod = 0;
        String xStr = String.valueOf(x);
        
        for(int i = 0; i < xStr.length(); i++){
             mod += xStr.charAt(i) - 48;
        }
        
        return (x%mod == 0) ? true: false;
    }
}