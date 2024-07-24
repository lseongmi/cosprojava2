/*=======================================================
 * 4차시 9번 : 4차 2급 9_initial_code.java
 =========================================================*/
package fourthExam.Fifthexam4;
// 다음과 같이 import를 사용할 수 있습니다.

class Solution {
    public int solution(int[][] height) {
        // 여기에 코드를 작성해주세요.
        int count = 0;
        int colum = height[0].length;
        int rows = height.length;


        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < colum; j++) {
                int value = height[i][j];
                boolean answer = true;

                if(i > 0 && value <= height[i - 1][j]) {
                    answer = false;
                }
                if(i < rows -1 && value <= height[i + 1][j]) {
                    answer = false;
                }
                if(j > 0  && value <= height[i][j - 1]) {
                    answer = false;
                }
                if (j < colum - 1 && value <= height[i][j + 1]) {
                    answer = false;
                }
                if(answer) {
                    count++;
                }
            }
        }
        return count;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] height = {{3, 6, 2, 8}, {7, 3, 4, 2}, {8, 6, 7, 3}, {5, 3, 2, 9}};
        int ret = sol.solution(height);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}