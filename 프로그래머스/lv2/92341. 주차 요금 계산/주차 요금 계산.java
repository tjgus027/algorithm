import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parking = new HashMap<>(); //입출자 리스트
        Map<String, Integer> fee = new TreeMap<>(); //요금 정리
        
        for(int i = 0; i < records.length; i++){
            String[] arr = records[i].split(" ");
            int time = changeMinutes(arr[0]);
            String car = arr[1];
            
            if(arr[2].equals("IN")){
                parking.put(car, time);
            } else {
                if(!fee.containsKey(car)){
                    int useTime = time - parking.get(car);
                    fee.put(car, useTime);
                } else{
                    int useTime = fee.get(car) + time - parking.get(car);
                    fee.put(car, useTime);
                }
                parking.remove(car);
            }
        }
        
        for(String key: parking.keySet()){
            if(!fee.containsKey(key)){
                fee.put(key, 1439-parking.get(key));
            } else{
                fee.put(key, 1439-parking.get(key)+fee.get(key));
            }
        }
        
        int[] answer = new int[fee.size()];
        int idx = 0; 
        for(String car : fee.keySet()){
            int min = fee.get(car);
            if(min <= fees[0]){
                answer[idx++] = fees[1];
            } else {
                double time = Math.ceil((double)(min - fees[0])/fees[2]);
                int money = (int) time * fees[3];
                answer[idx++] = fees[1] + money;
            }
        }
        return answer;
    }
    
    public int changeMinutes(String times){
        String[] time = times.split(":");
        int hour = Integer.parseInt(time[0])*60;
        int minutes = Integer.parseInt(time[1]);
        return hour+minutes;
    }
}