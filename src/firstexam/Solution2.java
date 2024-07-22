/*========================================================
  1차 2번    1차 2급 2_initial_code.java
  ========================================================*/
// You may use import as below.
package firstexam;
import java.util.*;

class Solution2 {
    public int solution(int price, String grade) {
        // Write code here.
        int answer = 0;
        switch (grade) {
        case "S":
        	answer = (int)(price * 0.95);
        	break;
        case "G":
        	answer = (int)(price * 0.9);
        	break;
        case "V":
        	answer = (int)(price * 0.85);
        	break;
        }        	
        return answer;
    }    

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}