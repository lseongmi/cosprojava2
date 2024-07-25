package cospro3;

public class Solution8 {
    public int solution(int usage) {

        int answer = 0;

        if(usage > 30)
            answer = 20 * 430 + 10 * 570 + (usage - 30) * 840;
        else if(usage > 20)
            answer = 20 * 430 + (usage - 20) * 570;
        else
            answer = usage * 430;

        return answer;
    }

    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int usage = 35;
        int ret = sol.solution(usage);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
