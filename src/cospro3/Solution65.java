package cospro3;

public class Solution65 {
    public int solution(int money, int price, int n) {

        int answer = 0;

        int emptyBottle = answer = money / price;
        while(n <= emptyBottle) {
            emptyBottle = emptyBottle - n;
            answer++;
            emptyBottle++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution65 sol = new Solution65();
        int money1 = 8;
        int price1 = 2;
        int n1 = 4;
        int ret1 = sol.solution(money1, price1, n1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int money2 = 6;
        int price2 = 2;
        int n2 = 2;
        int ret2 = sol.solution(money2, price2, n2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
