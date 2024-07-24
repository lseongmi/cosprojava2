/*========================================================
  1차 5번    1차 2급 5_initial_code.java
  ========================================================*/
package fitstExam.thirdexam;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        for(int i = 0; i < right; i++) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }
//        while(left < right){
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left += 1;
//            right -= 1;
//        }
        return arr;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 4, 2, 3};
        int[] ret = sol.solution(arr);
 
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}