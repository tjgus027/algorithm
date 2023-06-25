class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        try{
            answer = (s.length() == 4 || s.length() == 6);
            int sInt = Integer.parseInt(s);
        } catch (Exception e){
            answer = false;
            return answer;
        }
        return answer;
    }
}