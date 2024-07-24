package thirdExam.secondexam3;
/*========================================================
  3차 3번    3차 2급 3_initial_code.java
  ========================================================*/
// 다음과 같이 import를 사용할 수 있습니다.


class Solution {
    public int solution(int[] scores) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int max = 0;
        int min = 99;
        int sum = 0;

        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            if(max < scores[i]) max = scores[i];
            if(min > scores[i]) min = scores[i];

        }
        sum = sum - (max + min);
        answer = sum/(scores.length-2);
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
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