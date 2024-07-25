package cospro3;

public class Solution64 {
    public int solution(String[][] cards) {

        int answer = 0;

        String color1 = cards[0][0];
        String color2 = cards[1][0];
        String color3 = cards[2][0];

        int num1 = Integer.parseInt(cards[0][1]);
        int num2 = Integer.parseInt(cards[1][1]);
        int num3 = Integer.parseInt(cards[2][1]);

        int sum = num1 + num2 + num3;

        for(int i =0; i < cards.length; i++) {
            for(int j = 0; j < cards.length; j++) {
                if(color1.equals(color2) && color2.equals(color3)) {
                    answer = sum * 3;
                }
                if(color1.equals(color2) || color2.equals(color3) || color1.equals(color3)) {
                    answer = sum * 2;
                }
                else {
                    answer = sum;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution64 sol = new Solution64();
        String[][] cards1 = {{new String("blue"), new String("2")}, {new String("red"), new String("5")}, {new String("black"), new String("3")}};
        int ret1 = sol.solution(cards1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[][] cards2 = {{new String("blue"), new String("2")}, {new String("blue"), new String("5")}, {new String("black"), new String("3")}};
        int ret2 = sol.solution(cards2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }


}
