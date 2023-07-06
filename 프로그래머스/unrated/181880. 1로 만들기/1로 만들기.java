class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++){
            while(num_list[i] != 1){
                // if(num_list[i]%2 == 0) {
                    num_list[i] /= 2;
                    answer++;
                // } else {
                //     //int 타입이라 1을 뺄 필요가 없었음 = 홀, 짝 구분 필요 없음
                //     num_list[i] = (num_list[i]-1)/2;
                //     answer++;
                // }
            }
        }
        return answer;
    }
}