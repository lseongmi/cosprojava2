package cospro3;

public class Solution61 {
    public int solution(int[] temperature, int A, int B) {

        int answer = 0;
        for(int i = A+1; i < B; i++) {
            if(temperature[i] > temperature[A] && temperature[i] > temperature[B])
                answer += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution61 sol = new Solution61();
        int[] temperature = {3, 2, 1, 5, 4, 3, 3, 6};
        int A = 1;
        int B = 6;
        int ret = sol.solution(temperature, A, B);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
