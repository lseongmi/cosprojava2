package cospro2;
import java.util.*;

public class Solution47 {

    int func_a(int scores1[], int scores2[]) {
        int answer = 0;
        for(int i=0; i<scores1.length; i++)
            if (answer < scores2[i] - scores1[i])
                answer = scores2[i] - scores1[i];
        return answer;
    }

    int func_b(int scores1[], int scores2[]) {
        int answer = 0;
        for(int i=0; i<scores1.length; i++)
            if (answer > scores2[i] - scores1[i])
                answer = scores2[i] - scores1[i];
        return answer;
    }

    public int[] solution(int[] midScores, int[] finalScores) {
        int[] answer = {0, 0};
        answer[0] = func_a(midScores, finalScores);
        answer[1] = func_b(midScores, finalScores);
        return answer;
    }

    public static void main(String[] args) {
        Solution47 sol = new Solution47();
        int[] midScores = {20, 50, 40};
        int[] finalScores = {10, 50, 70};
        int[] ret = sol.solution(midScores, finalScores);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.print("solution 메소드의 반환 값은 ");
        System.out.printf(Arrays.toString(ret));
        System.out.println(" 입니다.");
    }
}
