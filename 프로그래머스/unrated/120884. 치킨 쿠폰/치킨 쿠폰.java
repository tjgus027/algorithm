class Solution {
    private final int BONUS_NUM = 10;
    
    public int solution(int chicken) {
        int answer = 0;
        
        while(chicken >= BONUS_NUM){
            int newChicken = chicken/BONUS_NUM;
            int restChi = chicken%BONUS_NUM;
            
            chicken = newChicken + restChi;
            answer += newChicken;
        }
        return answer;
    }
}