package cospro3;

public class Solution5 {
    public int solution(int a, int b) {

        int answer = 0;

        for(int i = 1; i <= b; i++) {
            if((b * i) % a == 0) {
                answer = b * i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int a = 4;
        int b = 6;
        int ret = sol.solution(a, b);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
