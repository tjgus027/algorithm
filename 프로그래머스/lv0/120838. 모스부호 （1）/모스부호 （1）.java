import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] arr = letter.split(" ");
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb = new StringBuilder();
        
        for(String str : arr){
            for(int i = 0; i < mos.length; i++){
                if(str.equals(mos[i])) sb.append(Character.toString(i + 'a') + "");
            }
        }
        return sb.toString();
    }
}