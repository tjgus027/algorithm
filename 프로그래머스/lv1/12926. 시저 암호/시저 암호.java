class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] array = s.toCharArray();
        for(char x: array) {
            if(x == ' ') {
                answer += ' '; 
                continue;
            } 
            if( 96 < x && x < 123 ) {
                if(x+n > 122) {
                answer += Character.toString(x-26+n);
            } else {
                answer += Character.toString(x+n);
            } 
        } else if (64 < x && x < 91) {
                if(x+n > 90) {
                answer += Character.toString(x-26+n);
                } else {
                    answer += Character.toString(x+n);
                }
            }
    }
        return answer;
}
}