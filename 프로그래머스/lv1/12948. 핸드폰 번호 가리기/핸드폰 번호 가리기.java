class Solution {
    public String solution(String phone_number) {
        String answer = "";
        if(phone_number.length() == 0) return phone_number;
        
        for(int i = 0; i < phone_number.length()-4; i++){
            answer += "*";
        }
        answer = answer + phone_number.substring(phone_number.length()-4);
        return answer;
    }
}