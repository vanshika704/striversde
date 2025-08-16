package day6;

public class maximumProductsubarray {
    public static int brute (int arr[]){
        int n = arr.length ;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <n ;i++){
            int product = 1 ;
            for(int j = i ; j < n ; j++){
                product *= arr[j] ;
                max = Math.max(max , product);

            }

        }
        return max;
    }

    public static int optimal(int arr[]){
        int n = arr.length ;
        int maxProduct = arr[0];
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        for(int i = 1; i< n ; i++){
            if (arr[i]<0){
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere ;
                minEndingHere = temp ;

            }
            maxEndingHere = Math.max(arr[i], maxEndingHere * arr[i]);
            minEndingHere = Math.min(arr[i], minEndingHere * arr[i]);

            maxProduct = Math.max(maxProduct, maxEndingHere);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,3,4} ;
        System.out.println(brute(arr));
    }
}
