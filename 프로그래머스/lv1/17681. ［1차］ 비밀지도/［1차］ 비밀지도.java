class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] array1 = new String[n]; //첫번째 지도
        String[] array2 = new String[n]; //두번째 지도
        String[] answer = new String[n]; //비밀지도
        
        //2진수로 담기
        for(int i = 0; i < n; i++){
            array1[i] = Integer.toString(arr1[i], 2);
            array2[i] = Integer.toString(arr2[i], 2);
        }
        
        //겹치기
        for(int i = 0; i < n; i++){
            answer[i] = Long.parseLong(array1[i]) + Long.parseLong(array2[i]) + "";
        }
        
        //지도로 포맷으로 변경
        for(int i = 0; i < n; i++){
            answer[i] = answer[i].replaceAll("2", "1");
            answer[i] = answer[i].replaceAll("0", " ");
            answer[i] = answer[i].replaceAll("1", "#");
        }
        
        //자릿수 맞추기
        for(int i = 0; i < n; i++){
            while(answer[i].length() < n){
                answer[i] = " " + answer[i];
            }
        }
        return answer;
    }
}