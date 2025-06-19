import java.util.HashMap;

public class majorityelement {
    // public static int brute(int[] nums) {
    //     int n = nums.length;

    //     for (int i = 0; i < n; i++) {
    //         int count = 0;

    //         for (int j = 0; j < n; j++) {
    //             if (nums[i] == nums[j]) {
    //                 count++;
    //             }
    //         }

    //         if (count > n / 2) {
    //             return nums[i];  // ✅ return immediately when found
    //         }
    //     }

    //     return -1;  // Just in case (though it's guaranteed to exist)
    // }
    ///////////////////////////////////////////////////////////////////////////////////

//     public static int better(int[] nums) {
// int n = nums.length;
// HashMap<Integer,Integer> map = new HashMap<>();
// for (int num: nums){
//     map.put(num,map.getOrDefault(num,0)+1);
//     if (map.get(num) >n/2){
//         return num;
//     }
// }
// return -1;
//     }

///////////////////////////////////////////////////////////////
///     Boyer Moore
public static int boyer(int[] nums) {
 
    int count = 0;
    int candidate = 0;

    for (int num : nums) {
        if (count == 0) {
            candidate = num;
        }

        count += (num == candidate) ? 1 : -1;
    }

    return candidate;
}


    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(boyer(nums));  // Output: 3
    }
}
