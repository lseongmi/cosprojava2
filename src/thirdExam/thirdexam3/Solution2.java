/*========================================================
  3차 6번    3차 2급 6_initial_code.java
  ========================================================*/
package thirdExam.thirdexam3;
class Solution2 {
    public String solution(int tileLength) {
        String answer = "";
        String com = "RRRGGB";
        if(tileLength%6 == 1 || tileLength%6 == 2 || tileLength%6 == 4)
        answer = "-1";
        else {
            for (int i = 0; i < tileLength; i++)
                answer += com.charAt(i % 6);
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int tileLength1 = 11;
        String ret1 = sol.solution(tileLength1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int tileLength2 = 16;
        String ret2 = sol.solution(tileLength2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}