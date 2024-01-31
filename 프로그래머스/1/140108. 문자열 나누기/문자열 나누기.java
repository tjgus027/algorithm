class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int equal = 0;
        int unequal = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(equal == unequal) {
                answer++;
                equal = 0;
                unequal = 0;
                first = s.charAt(i);
            }
            
            if(first == s.charAt(i)){
                equal++;
            } else {
                unequal++;
            }
        }
        return answer;
    }
}