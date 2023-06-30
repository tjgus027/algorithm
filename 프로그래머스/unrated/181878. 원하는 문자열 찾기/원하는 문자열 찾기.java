class Solution {
    public int solution(String myString, String pat) {
        if(myString.length() < myString.length()) return 0;
        
        String str = myString.toLowerCase();
        String patStr = pat.toLowerCase();
        
        return (str.contains(patStr)) ? 1 : 0;
    }
}