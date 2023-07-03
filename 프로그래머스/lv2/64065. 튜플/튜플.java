import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        
        //{{, }} 제거
        s = s.substring(2, s.length()-2);
        s = s.replace("},{", "a");
        
        //-을 기준으로 배열 생성
        String[] strArr = s.split("a");
        
        //다른 코드 참고
        Arrays.sort(strArr,new Comparator<String>(){
            public int compare(String o1, String o2){
                
                return Integer.compare(o1.length(), o2.length());
            }
        });
        
        for(int i = 0; i < strArr.length; i++){
            //,을 기준으로 새로운 배열 생성
            String[] strArr2 = strArr[i].split(",");
            //위 배열로 for-loop 
            for(int j = 0; j < strArr2.length; j++){
                //string->int로 변경해서 list에 없으면 추가
                int n = Integer.parseInt(strArr2[j]);
                if(!list.contains(n)){
                    list.add(n);
                }
            }
        }
        
        //stream과 람다식 사용하여 list를 배열로
        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }
}