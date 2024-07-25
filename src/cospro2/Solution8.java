package cospro2;

public class Solution8 {
    public int solution(int[][] programs) {

        int answer = 0;
        int[] usedTv = new int[25];

        for(int i = 0; i < programs.length; i++)
            for(int j = programs[i][0]; j < programs[i][1]; j++)
                usedTv[j]++;

        for(int i = 0; i < 25; i++)
            if(usedTv[i] >= 2)
                answer++;

        return answer;
    }
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        int[][] programs = {{1, 6}, {3, 5}, {2, 8}};
        int ret = sol.solution(programs);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
