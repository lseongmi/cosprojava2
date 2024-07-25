package cospro3;

public class Solution7 {
    public int solution(int[] stuffs) {

        int answer = 0;

        int smallCounter = 0;
        int generalCounter = 0;

        for(int i = 0; i < stuffs.length; i++) {
            if(stuffs[i] > 3)
                generalCounter += stuffs[i];
            else
                smallCounter += stuffs[i];
        }

        if(smallCounter > generalCounter)
            answer = smallCounter;
        else
            answer = generalCounter;

        return answer;
    }

    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        int[] stuffs = {5, 3, 4, 2, 3, 2};
        int ret = sol.solution(stuffs);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
