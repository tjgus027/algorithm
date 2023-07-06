class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
//         boolean b1 = false;
//         if(x1 || x2) b1 = true; 
        
//         boolean b2 = false;
//         if(x3 || x4) b2 = true; 
        
//         boolean answer = false;
//         if(b1 && b2) return true;
//         return answer;
        
        //선술한 식 정리
        return (x1 || x2) && (x3 || x4);
    }
}