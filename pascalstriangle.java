////////////////////////////////////////////////
/// brute force : use factorial formula ncr = n! / (r! * (n-r)!) to calculate each value ; 
/// time complexity : 0(n3)

// import java.util.ArrayList;
// import java.util.List;

// public class pascalstriangle {
//  public static List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> triangle = new ArrayList<>();

//         for (int n = 0; n < numRows; n++) {
//             List<Integer> row = new ArrayList<>();
//             for (int r = 0; r <= n; r++) {
//                 row.add(nCr(n, r));
//             }
//             triangle.add(row);
//         }

//         return triangle;
//     }

//     // Helper to calculate nCr using factorial
//     public static int nCr(int n, int r) {
//         return factorial(n) / (factorial(r) * factorial(n - r));
//     }

//     public static int factorial(int num) {
//         int result = 1;
//         for (int i = 2; i <= num; i++) result *= i;
//         return result;
//     }

//     public static void main(String[] args) {
//         List<List<Integer>> triangle = generate(5);
//         for (List<Integer> row : triangle) System.out.println(row);
//     }
// }
//////////////////////
/// Better	Use iterative formula: nCr = nC(r-1) × (n - r + 1) / r for each row	
/// O(n²)

import java.util.ArrayList;
import java.util.List;

// public class pascalstriangle {
//     public static List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> triangle = new ArrayList<>();

//         for (int n = 0; n < numRows; n++) {
//             List<Integer> row = new ArrayList<>();
//             int val = 1;
//             for (int r = 0; r <= n; r++) {
//                 row.add(val);
//                 val = val * (n - r) / (r + 1); // Efficient nCr transition
//             }
//             triangle.add(row);
//         }

//         return triangle;
//     }

//     public static void main(String[] args) {
//         List<List<Integer>> triangle = generate(5);
//         for (List<Integer> row : triangle) System.out.println(row);
//     }
// }
///////////////////////////////////////////////////
/// optimal 	Build triangle by summing previous row values (classic DP approach) 
/// time 	O(n²), space :O(n²)
public class pascalstriangle {public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = generate(5);
        for (List<Integer> row : triangle) System.out.println(row);
    }}