class Solution {
    public String solution(String my_string, int s, int e) {
        if(s == e) return my_string;
        
        String s1 = my_string.substring(0, s); //Progra
        String s2 = my_string.substring(e+1); //3
        String s3 = "";
        
        String str = my_string.substring(s, e+1); //21Srem
        for(int i = 0; i < str.length(); i++){
            s3 += str.charAt(str.length()-i-1);
        }
        
        return s1 + s3 + s2;
    }
}