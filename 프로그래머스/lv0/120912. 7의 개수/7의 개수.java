class Solution {
    public int solution(int[] array) {
        String str = "";
        for(int i : array){
            str += String.valueOf(i);
        }
        
        int oldLen = str.length();
        str = str.replaceAll("7","");
        int newLen = str.length();
        
        return oldLen - newLen;
    }
}