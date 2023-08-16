import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> user = new HashMap<>();
        int len = record.length;
        
        for(int i = 0; i < record.length; i++){
            String[] strArr = record[i].split(" ");
            if(strArr[0].equals("Enter")) {
                user.put(strArr[1], strArr[2]);
            } else if(strArr[0].equals("Change")){
                user.put(strArr[1], strArr[2]);
                len--;
            } 
        }
        
        String[] answer = new String[len];
        int idx = 0; 
        
        for(int i = 0; i < record.length; i++){
            String[] strArr = record[i].split(" ");
            String name = user.get(strArr[1]);
            
            if(strArr[0].equals("Enter")){
                answer[idx++] = name + "님이 들어왔습니다.";
            } else if(strArr[0].equals("Leave")){
                answer[idx++] = name + "님이 나갔습니다.";
            }
        }
        
        return answer;
    }
}