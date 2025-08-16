package day1;

import java.util.HashSet;

public class duplicateno {
public static void brute ( int arr[]){
    for(int i =  0 ; i < arr.length ;  i++){
        for(int j =  i + 1 ; j < arr.length ; j++){
            if(arr[j]==arr[i]){
                System.out.println(arr[i] + " is duplicate");
            }
        }
    }
}

public static void better (int arr[]){
    HashSet<Integer> seen = new HashSet<>();
    for(int num: arr){
        if(seen.contains(num)){
            System.out.println(num + " is duplicate");
        }
        else{
            seen.add(num);
        }
    }
}

public static int findDuplicate(int[] arr) {
    // Step 1: detect cycle (Floyd's algorithm)
    int slow = arr[0];
    int fast = arr[0];

    do {
        slow = arr[slow];         // move 1 step
        fast = arr[arr[fast]];    // move 2 steps
    } while (slow != fast);

    // Step 2: find entry point of cycle (duplicate number)
    fast = arr[0];  // reset one pointer
    while (slow != fast) {
        slow = arr[slow];
        fast = arr[fast];
    }

    return slow;  // or fast, both are same = duplicate number
}

    public static void main(String[] args)
     {
        int[] arr = {1, 2, 3, 4, 5,6,6,7};
        brute(arr);
    }
}
