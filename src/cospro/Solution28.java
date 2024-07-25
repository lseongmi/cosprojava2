package cospro;

public class Solution28 {
    public int solution(int number) {

        int count = 0;
        while(number > 0){
            int n = number % 10;
            if (n == 2 || n == 3 || n == 5 || n == 7)
                count += 1;
            number /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Solution28 sol = new Solution28();
        int number = 29022531;
        int ret = sol.solution(number);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
