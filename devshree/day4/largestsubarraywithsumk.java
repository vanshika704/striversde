package day4;

import java.util.HashMap;
import java.util.Map;

public class largestsubarraywithsumk {
    public static int brute(int arr[]){
        int n = arr.length;
        int maxLen= 0 ;
        for(int i =0 ; i <n ; i++){
            int zeros = 0 ; int ones = 0 ;
            for(int j = i ; j < n ;j++){
                if(arr[j] == 0) zeros++;
         else ones++;
        if(zeros==ones){
            maxLen = Math.max(maxLen , j-i+1);
        }   }
        }
        return maxLen;

    }
    public static int optimal (int arr[]){
        int n = arr.length ;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0 ,maxLen = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]==0)sum+=-1;
            else sum+=1 ;
            if(sum==0){
                maxLen = i+1;
            }
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen , i-map.get(sum));
            }else{
                map.put(sum , i);
            }
       
        }
        return maxLen;
    }
     public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 1, 1, 0, 0};
        int[] arr2 = {0, 0, 1, 1, 0};
        int[] arr3 = {0};

        System.out.println("Brute: " + brute(arr1));
        
        System.out.println("Optimal: " + optimal(arr1));

        System.out.println("Optimal arr2: " + optimal(arr2));
        System.out.println("Optimal arr3: " + optimal(arr3));
    }

}
