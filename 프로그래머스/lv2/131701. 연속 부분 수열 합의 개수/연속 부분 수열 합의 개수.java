import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int num = 1; //elements의 원소가 1 이상이라 num을 1로 설정
        HashSet<Integer> set = new HashSet<>();
        while(num <= elements.length) {
            int sum = 0;
            for(int i = 0; i < num; i++){
                // 나머지를 구하는 이유는 i가 배열의 크기를 넘을 수 있기 때문에 배열의 크기를 넘지 않기 위해서 나머지를 구함
                sum += elements[i % elements.length];
                set.add(sum);
            }
            
            // for문을 통해 시작 인덱스부터 elements 배열의 끝까지 한칸씩 밀며 진행 
            for (int i = 0; i < elements.length; i++) {
                sum -= elements[i % elements.length];
                sum += elements[(i + num) % elements.length];
                set.add(sum);
            }
            num++;
        }
        answer = set.size();
        return answer;
    }
}