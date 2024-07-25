package cospro2;

public class Solution3 {
    public int solution(int[] scores) {

        int answer = 0;
        int min  = 101;
        int max = 0;
        int sum = 0;
        for(int i = 0 ; i < scores.length; i++) {
            sum += scores[i];
            if(scores[i] < min) min = scores[i];
            else if(scores[i] > max) max = scores[i];
        }
        sum = sum - (max+min);
        answer = sum / (scores.length-2);
        return answer;
    }
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[] scores1 = {35, 28, 98, 34, 20, 50, 85, 74, 71, 7};
        int ret1 = sol.solution(scores1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] scores2 = {1, 1, 1, 1, 1};
        int ret2 = sol.solution(scores2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
