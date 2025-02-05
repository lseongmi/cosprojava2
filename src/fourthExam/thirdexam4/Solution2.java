/*=======================================================
 * 4차시 6번 : 4차 2급 6_initial_code.java
 =========================================================*/
package fourthExam.thirdexam4;
class Solution2 {
    public int solution(int point) {
        if (point < 1000)
            return 0;
        return point / 100 * 100;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int point = 2323;
        int ret = sol.solution(point);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}