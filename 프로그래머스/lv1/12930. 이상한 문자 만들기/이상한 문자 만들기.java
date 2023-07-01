class Solution {
    public String solution(String s) {
//         String answer = "";
//         String[] str = s.split("");
        
//         int idx = 0;
//         for(int i = 0; i < str.length; i++){
//             //str[i] = str[i].toLowerCase();
//             if(str[i].equals(" ")){
//                 idx = 0;
//             } else if (idx%2 == 0){
//                 str[i] = str[i].toUpperCase();
//                 idx++;
//             } else if (idx%2 != 0){
//                 str[i] = str[i].toLowerCase();
//                 idx++;
//             }
//             answer += str[i];
//         }
        
//         return answer;

        //다른 사람 풀이 + sb 성능 테스트
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            if(cnt%2 == 0){
                sb.append(ss.toLowerCase());
            } else {
                sb.append(ss.toUpperCase());
            }
        }
        
        return sb.toString();
    }
}