class Solution {
    public int solution(String dartResult) {
        int[] dart = new int[3];
        int num = 0, idx = 0;
        String strNum = "";
        
        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            
            if(c >= '0' && c <= '9'){ //숫자
                strNum += String.valueOf(c);
            } else if (c=='S'||c=='D'||c=='T'){ //보너스
                num = Integer.parseInt(strNum);
                if(c=='S'){
                   dart[idx++] = (int) Math.pow(num, 1);
                 }
                else if(c=='D'){
                    dart[idx++] = (int) Math.pow(num, 2);
                }
                else{
                    dart[idx++] = (int) Math.pow(num, 3);
                } 
                strNum = "";
            } else { //옵션
                if(c == '*'){
                    dart[idx-1] *= 2;
                    if(idx-2 >= 0) dart[idx-2] *= 2; 
                } else {
                    dart[idx-1] *= (-1);
                }
            }
        }
        
        return dart[0] + dart[1] + dart[2];
    }
}