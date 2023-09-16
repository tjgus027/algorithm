import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i : arr) {
            answer.add(i);
        }
        
        for (int i = 2; i < 1000; i *= 2) {
            if (arr.length == i) {
                return arr;
            } else if (arr.length > i && arr.length < i*2) {
                for (int j = 0; j < (i*2 - arr.length); j++) {
                    answer.add(0);
                }
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}