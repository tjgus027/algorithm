/*
확실히 밑에 다른 사람 풀이가 시간 복잡도 수치가 적어 효율적인 알고리즘임
*/
class Solution {
    public int solution(String myString, String pat) {
        //원래 내 풀이
         String newStr = "";
        
        for(int i = 0; i < myString.length(); i++){
            String str = String.valueOf(myString.charAt(i));
            if(str.equals("A")){
                newStr += "B";
            } else {
                newStr += "A";
            }
        }
        
        //다른 사람 풀이 참고
        myString = myString.replaceAll("A", "a");
        myString = myString.replaceAll("B", "A");
        myString = myString.replaceAll("a", "B");
        
        return (myString.contains(pat)) ? 1 : 0;
    }
}
