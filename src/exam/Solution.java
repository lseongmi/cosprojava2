///////////////////////////////////////////////////////////////////////////////////////////////////////////
// 문제1) A,B,C,D,E,F 후보를 투표한 후 최고 득점자를 출력하도록 한다
///////////////////////////////////////////////////////////////////////////////////////////////////////////
package exam;
import java.util.*;

class Solution {
    int[] func_a(String[] arr){
        int[] counter = new int[6];
        for(int i = 0; i < arr.length; i++){
            // here coding
            if(arr[i].equals("A")) {
                counter[0]++;
            }
            else if(arr[i].equals("B")) {
                counter[1]++;
            }
            else if(arr[i].equals("C")) {
                counter[2]++;
            }
            else if(arr[i].equals("D")) {
                counter[3]++;
            }
            else if(arr[i].equals("E")) {
                counter[4]++;
            }
            else if(arr[i].equals("F")) {
                counter[5]++;
            }

        }
        return counter;
    }
    int func_b(int[] arr){
        int ret = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            // here coding
            if(ret < arr[i]) {
                index = i;
            }
        }
        return ret;
    }

    String func_c(int n) {
        String a = "";
        if(n == 0) {
            a = "A";
        }
        else if(n == 1) {
            a = "B";
        }
        else if(n == 2) {
            a = "C";
        }
        else if(n == 3) {
            a = "D";
        }
        else if(n == 4) {
            a = "E";
        }
        else if(n == 5) {
            a = "F";
        }
        return a;
    }

    public String solution(String[] arr) {
        int[] counter = func_a(arr);
        int maxCnt = func_b(counter);
        String maxVote = func_c(maxCnt);
        return maxVote;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] vote = {"A", "A", "B", "C", "C", "B", "A", "A", "D", "E"};
        String ret = sol.solution(vote);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
