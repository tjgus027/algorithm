import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        //나누어 떨어지는 숫자 list에 넣기
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
            }
        }
        
        //리턴할 배열 생성
        int[] answer = null;
        
        //list -> 배열로 변환
        if(list.size() != 0) {
            answer = new int[list.size()];
            for(int i = 0; i < answer.length; i++){
                answer[i] = list.get(i);
            }
            //오름차순 정리
            Arrays.sort(answer);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}