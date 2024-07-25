package cospro3;

public class Solution69 {
    public int solution(int[] socks) {

        int answer = 0;

        int[] count = new int[10];
        for(int i = 0; i < socks.length; i++)
            count[socks[i]]++;

        for(int i = 0; i < 10; i++)
            answer += (count[i] / 2);

        return answer;
    }

    public static void main(String[] args) {
        Solution69 sol = new Solution69();
        int[] socks = {1, 2, 1, 3, 2, 1, 2, 2};
        int ret = sol.solution(socks);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
