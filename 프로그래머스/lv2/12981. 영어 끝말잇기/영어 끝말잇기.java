import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int cnt = 1; 
        Set<String> hs = new HashSet<>();
        hs.add(words[0]);
        
        for(int i = 1; i < words.length; i++){
            if(hs.contains(words[i])) break;
            if(words[i].charAt(0) == words[i-1].charAt(words[i-1].length()-1)){
                hs.add(words[i]);
                cnt++;
            }
            else break;
        }
        
        if(cnt == words.length) return new int[] {0,0};
        else return new int[] {cnt%n+1, cnt/n+1};

    }
}