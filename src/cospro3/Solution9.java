package cospro3;
import java.util.*;

public class Solution9 {
    public int[] solution(int[] score) {

        int[] answer = new int[score.length];
        int len = score.length;

        for(int i = 0; i < len; i++) {
            answer[i] = 1;
        }

        for(int i = 0;  i< len; i++) {
            for(int j = 0; j < len; j++) {
                if(score[i] < score[j]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int[] score1 = {90, 87, 87, 23, 35, 28, 12, 46};
        int[] ret1 = sol.solution(score1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret1) + " 입니다.");

        int[] score2 = {10, 20, 20, 30};
        int[] ret2 = sol.solution(score2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret2) + " 입니다.");
    }
}
