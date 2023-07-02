class Solution {
    public String[] solution(String[] names) {
        //5명 이하
        if(names.length <= 5) return new String[]{names[0]};
        
        //5명 초과
        int len = (names.length%5 == 0) ? names.length/5 : (names.length/5)+1;
        String[] answer = new String[len];
        int idx = 0;
        
        for(int i = 0; i < names.length; i=i+5){
            answer[idx++] = names[i];
        }
        
        return answer;
    }
}