package cospro3;

public class Solution10 {
    public int solution(int[] timeTable, int n) {

        int answer = 0;
        int workTime[] = new int[timeTable.length];

        for(int i = 0; i < timeTable.length; i++) {
            int rotation = i % n;
            workTime[rotation] += timeTable[i];
        }

        for(int i = 0; i < workTime.length; i++){
            if(answer < workTime[i]) {
                answer =workTime[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        int[] timeTable1 = {1, 5, 1, 9};
        int n1 = 3;
        int ret1 = sol.solution(timeTable1, n1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] timeTable2 = {4, 8, 2, 5, 4, 6, 7};
        int n2 = 4;
        int ret2 = sol.solution(timeTable2, n2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
