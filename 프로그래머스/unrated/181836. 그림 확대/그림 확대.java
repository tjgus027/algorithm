import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < picture.length; i++){
            StringBuilder sb = new StringBuilder();
            
            for(char str: picture[i].toCharArray()){
                for(int z = 0; z < k; z++){
                    sb.append(str+"");
                }
            }
            
            for(int z = 0; z < k; z++){
                list.add(sb.toString());
            }
        }

        return list.toArray(new String[list.size()]);

    }
}