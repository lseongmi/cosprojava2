package cospro3;

public class Solution6 {
    public int solution(int korean, int english) {

        int answer = 0;

        int math = 210 - (korean + english);

        if(math > 100)
            answer = -1;
        else
            answer = math;

        return answer;
    }

    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int korean = 70;
        int english = 60;
        int ret = sol.solution(korean, english);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
