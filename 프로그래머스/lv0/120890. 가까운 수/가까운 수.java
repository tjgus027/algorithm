import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        if(array.length == 1) return array[0];
        
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= n) {
                int leftValue = n - array[(i - 1)];
                int rightValue = array[i] - n;
                return leftValue <= rightValue ? array[(i - 1)] : array[i];
            }
        }
        return array[array.length - 1];
    }
}