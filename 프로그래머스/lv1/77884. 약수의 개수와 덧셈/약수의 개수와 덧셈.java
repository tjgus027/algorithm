class Solution {
    public int solution(int left, int right) {
        int[] arr = new int[right-left+1];
        //약수의 개수 구하기
        int idx = 0;
        for(int i = left; i < right+1; i++){
            for(int j = 1; j <= i; j++){
                if(i%j == 0) arr[idx]++;
            }
            idx++;
        }
        
        //정답 출력
        int answer = 0;
        for(int i = 0, j = left; i < arr.length; i++, j++){
            answer = (arr[i]%2 == 0) ? answer + j : answer - j;
        }
        
        return answer;
    }
}