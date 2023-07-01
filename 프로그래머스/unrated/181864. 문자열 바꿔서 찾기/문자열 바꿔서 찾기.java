class Solution {
    public int solution(String myString, String pat) {
        String newStr = "";
        
        for(int i = 0; i < myString.length(); i++){
            String str = String.valueOf(myString.charAt(i));
            if(str.equals("A")){
                newStr += "B";
            } else {
                newStr += "A";
            }
        }
        
        return (newStr.contains(pat)) ? 1 : 0;
    }
}