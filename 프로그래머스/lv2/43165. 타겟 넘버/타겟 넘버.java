class Solution {
    //dfs가 괜찮은지 판단 기준 = 최악의 경우가 500만 번 이하여야 시간복잡도에서 괜찮음
    //최악의 경우는 2의 20승 = 100만 번 이상 = 500만 번 이하
    int[] numbers;
    int target;
    int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0; 
        this.numbers = numbers;
        this.target = target;
        
        dfs(0, 0);
        
        return answer;
    }
    
    void dfs(int index, int sum){
        //1. 탈출 조건
        if(index == numbers.length){
            if(sum == target) answer++;
            return;
        }
         
        //2. 수행동작 - 이부분 먼저 구현
        dfs(index + 1, sum + numbers[index]); //더하는 동작
        dfs(index + 1, sum - numbers[index]); //빼는 동작
    }
}