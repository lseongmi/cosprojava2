package cospro;

public class Solution7 {
    public int solution(int[] scores) {

        int count = 0;
        for (int i = 0; i < scores.length; i++)
            if (650 <= scores[i] && scores[i] < 800)
                count += 1;
        return count;
    }
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
        int ret = sol.solution(scores);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
