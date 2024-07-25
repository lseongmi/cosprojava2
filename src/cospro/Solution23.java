package cospro;

public class Solution23 {
    public int solution(int N, int M) {

        int answer = 0;
        for(int i = N; i < M; i++) {
            if(i%2 == 0) {
                answer += i * i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        int N = 4;
        int M = 7;
        int ret = sol.solution(N, M);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
