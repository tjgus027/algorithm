class Solution {
    public int solution(int a, int b) {
        String str1 = Integer.toString(a) + Integer.toString(b);
        String str2 = Integer.toString(b) + Integer.toString(a);
        
        int n1 = Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);
        
        return (n1 >= n2) ? n1 : n2;
    }
}