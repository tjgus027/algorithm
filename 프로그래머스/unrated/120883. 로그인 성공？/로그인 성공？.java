import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> dbMap = new HashMap<>();
        for(String[] key : db){
            for(String value : key){
                dbMap.put(key[0], value);
            }
        }
        
        if(dbMap.containsKey(id_pw[0])){
            if(dbMap.get(id_pw[0]).equals(id_pw[1])){
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
    }
}