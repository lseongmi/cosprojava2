package cospro3;

public class Solution67 {
    public int solution(int money, int[] chairs, int[] desks) {
        int answer = 0;

        for(int i = 0; i < chairs.length; i++) {
            for(int j = 0; j < desks.length; j++) {
                int price = chairs[i] + desks[j];
                if(answer < price && price <= money)
                    answer = price;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution67 sol = new Solution67();
        int money1 = 7;
        int[] chairs1 = {2, 5};
        int[] desks1 = {4, 3, 5};
        int ret1 = sol.solution(money1, chairs1, desks1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int money2 = 7;
        int[] chairs2 = {3};
        int[] desks2 = {5};
        int ret2 = sol.solution(money2, chairs2, desks2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
