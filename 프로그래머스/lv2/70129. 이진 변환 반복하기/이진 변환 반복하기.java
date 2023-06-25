class Solution {
    public int[] solution(String s) {
        int count = 0;
        int remove = 0;
        while(!s.equals("1")) {
            int len = s.length();
            s = s.replace("0", "");
            count++;
            remove += (len-s.length());
            s = Integer.toBinaryString(s.length());
        } 
        
        int[] answer = {count,remove};
        return answer;
    }
}