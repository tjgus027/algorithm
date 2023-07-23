class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        for(String str : arr){
            if(str.length() == 0) answer += " "; //이게 없으면 null 체크 안 돼서 런타임에러
            else {
                String first = String.valueOf(str.charAt(0));
                if(Character.isLetter(str.charAt(0))){
                    answer += first.toUpperCase();
                    answer += str.substring(1).toLowerCase() + " ";
                } else {
                    answer += str.toLowerCase() + " ";
                }
            }
        }
        if(s.charAt(s.length()-1) == ' ') return answer;
        return answer.substring(0, answer.length()-1);
    }
}