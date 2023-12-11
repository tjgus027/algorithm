import java.util.*;
import java.math.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        List<Integer> list = new ArrayList<>();
        
        for(long i = left; i <= right; i++){
            list.add((int) Math.max(i/n, i%n) + 1);
        }
        
        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }
}