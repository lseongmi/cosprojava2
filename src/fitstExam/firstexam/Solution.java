package fitstExam.firstexam;
/*
  1차 1번    1차 2급 1_initial_code.java
  ========================================================*/
// You may use import as below.
import java.util.*;

class Solution {
    public int[] Solution(String[] shirtSize) {
        // Write code here.
        int[] size_counter = new int[6];
        for(int i = 0; i < shirtSize.length; ++i) {
            if(shirtSize[i].equals("XS"))
                size_counter[0]++;
            else if(shirtSize[i].equals("S"))
                size_counter[1]++;
            else if(shirtSize[i].equals("M"))
                size_counter[2]++;
            else if(shirtSize[i].equals("L"))
                size_counter[3]++;
            else if(shirtSize[i].equals("XL"))
                size_counter[4]++;
            else if(shirtSize[i].equals("XXL"))
                size_counter[5]++;
        }

        return size_counter;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        int[] ret = sol.Solution(shirtSize);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}
