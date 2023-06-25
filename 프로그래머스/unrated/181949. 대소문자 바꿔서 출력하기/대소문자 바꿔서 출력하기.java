import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String str = "";
        String s = "";
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            s = String.valueOf(c);
            
            if(Character.isUpperCase(c)){
                str += s.toLowerCase();
            } else {
                str += s.toUpperCase();
            }
        }
        System.out.println(str);
    }
}