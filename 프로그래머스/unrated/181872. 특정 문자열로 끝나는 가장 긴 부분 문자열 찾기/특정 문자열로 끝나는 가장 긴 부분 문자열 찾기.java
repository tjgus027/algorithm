class Solution {
    public String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat);
        if(pat.length() > 1) idx = idx + pat.length() -1;
        return myString.substring(0, idx+1);
    }
}