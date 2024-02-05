import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        int answer = 0; 
        
        for(int i = 0; i < len; i++){
            if(arr[i] == target){
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}