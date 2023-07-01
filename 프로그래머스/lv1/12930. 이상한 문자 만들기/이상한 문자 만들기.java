/*
시간복잡도에서 1ms 정도의 수치가 차이남
이번 코드의 경우 스트링에 계속 추가하는 것보다, stringbuilder를 사용해서 하는 것이 더 효율적인 알고리즘임
*/

class Solution {
    public String solution(String s) {
        //원래 내 풀이
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
