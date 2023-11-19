class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] says = {"aya", "ye", "woo", "ma"};
        
        for(String word : babbling){
            for(int i = 0; i < says.length; i++){
                word = word.replaceAll(says[i], "0");
            }
            if(word.replaceAll("0", "").equals("")) answer++;
        }
        
        return answer;
    }
}