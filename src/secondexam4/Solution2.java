/*=======================================================
 * 4차시 4번 : 4차 2급 4_initial_code.java
 =========================================================*/
package secondexam4;
class Solution2 {
    public int solution(int[] classes, int m) {
        int answer = 0;
        for(int i=0; i<classes.length; i++) {
            answer += classes[i] / m;
            if (classes[i] - m != 0)
            answer++;
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] classes = {80, 45, 33, 20};
        int m = 30;
        int ret = sol.solution(classes, m);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}