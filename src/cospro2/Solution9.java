package cospro2;

public class Solution9 {
    public int solution(int day, int[] numbers) {

        int count = 0;
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i]%2 == day%2)
                count++;
        return count;
    }
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int day = 17;
        int[] numbers = {3285, 1724, 4438, 2988, 3131, 2998};
        int ret = sol.solution(day, numbers);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
