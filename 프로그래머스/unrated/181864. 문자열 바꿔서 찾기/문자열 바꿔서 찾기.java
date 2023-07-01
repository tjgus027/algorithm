class Solution {
    public int solution(String myString, String pat) {
//         String newStr = "";
        
//         for(int i = 0; i < myString.length(); i++){
//             String str = String.valueOf(myString.charAt(i));
//             if(str.equals("A")){
//                 newStr += "B";
//             } else {
//                 newStr += "A";
//             }
//         }
        
        //다른 사람 풀이 참고
        myString = myString.replaceAll("A", "a");
        myString = myString.replaceAll("B", "A");
        myString = myString.replaceAll("a", "B");
        
        return (myString.contains(pat)) ? 1 : 0;
    }
}