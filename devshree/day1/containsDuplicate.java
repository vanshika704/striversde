package day1;

import java.util.Arrays;
import java.util.HashMap;

class containsDuplicate {
    public static boolean Brute(int[]arr){
        int n = arr.length ;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[j]==arr[i]){
                    return true ;
                }
            }
        }
        return false;

    }
    public static  boolean better (int arr[]){
        int n = arr.length ;
        Arrays.sort(arr);
        for(int i = 0 ; i < n-1 ; i++){
            if(arr[i]==arr[i+1]){
                return true ;
            }
        }
        return false ;
    }
    public static boolean optimal (int arr[]){
        
        HashMap <Integer,Boolean> map = new HashMap<>();
        for(int num:arr ){
            if(map.containsKey(num)){
                return true ;
            }
            map.put(num,true);
        }
        return false ;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,6,7,9};
        System.out.println(Brute(arr));
         System.out.println(better(arr));
        System.out.println(optimal(arr));

    }
}
// brute : do loop lo , arr[i]==arr[j] check kro 
// better : sort kro , prev element check kro 
// optimal : hashmap use kro , if map. contains key , return true ,else return map.put num 