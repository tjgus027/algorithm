class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", " ");
        
        int answer = 0;
        String[] arr = my_string.trim().split("[ ]+");
        for(String str : arr){
            if(!str.isEmpty()) answer += Integer.parseInt(str);
        }
        return answer;
    }
}