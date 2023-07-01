class Solution {
    public int[] solution(int[] arr, int n) {
        //홀수일 경우
        if(arr.length%2 != 0){
            for(int i = 0; i < arr.length; i = i+2){
                arr[i] = arr[i] + n;
            }
            return arr;
            
        //짝수일 경우
        } else{
            for(int i = 1; i < arr.length; i = i+2){
                arr[i] = arr[i] + n;
            }
            return arr;
        }
    }
}