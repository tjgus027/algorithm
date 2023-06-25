import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        
        //대소문자 구분 무시를 위해 해줘야 함
        String smallStr1 = str1.toLowerCase();
        String smallStr2 = str2.toLowerCase();
        
        //str1 다중집합 만들기
        for (int i = 0; i < str1.length()-1; i++) {
        	char a = smallStr1.charAt(i);
        	char b = smallStr1.charAt(i+1);
        	
        	//문자인 경우만 list에 추가
        	if(Character.isLetter(a) && Character.isLetter(b)) {
        		String str = Character.toString(a) + Character.toString(b);
        		listA.add(str);
        	}
		}
        
        //str2 다중집합 만들기
        for (int i = 0; i < str2.length()-1; i++) {
        	char a = smallStr2.charAt(i);
        	char b = smallStr2.charAt(i+1);
        	
        	if(Character.isLetter(a) && Character.isLetter(b)) {
        		String str = Character.toString(a) + Character.toString(b);
        		listB.add(str);
        	}
        }
        //교집합 크기
        int inter = 0;
        
        //교집합 구하기
        for(String s: listA) {
        	if(listB.contains(s)) {
        		listB.remove(s);
        		inter++;
        	}
        }
        
        int union = listA.size()+listB.size();
        
        double jakard = 0;
        
        //집합 A와 집합 B가 모두 공집합일 경우
        if(inter+union == 0 || inter == union) {
        	jakard = 1;
        } else {
        	jakard = (double)inter / (double)union;
        }
        answer = (int) (jakard * 65536);
        
        return answer;
    }
}