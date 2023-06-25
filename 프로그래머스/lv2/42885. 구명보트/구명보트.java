import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int min = 0; //가장 가벼운 사람의 인덱스 위치 값
        int max = people.length-1; //가장 무거운 사람의 인덱스 위치 값
        
        while(min <= max){
            if(people[max] + people[min] <= limit) {
                answer++;
                max--;
                min++;
            } else {
                answer++;
                max--;
            }
        }
        return answer;
    }
}