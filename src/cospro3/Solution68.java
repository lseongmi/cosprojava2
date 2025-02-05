package cospro3;

public class Solution68 {
    public int func_a(int number1, int number2) {
        int ret = 0;

        if(number1 > number2)
            ret = number1 - number2;
        else
            ret = number2 - number1;

        return ret;
    }

    public int func_b(int number) {
        int ret = 0;

        while(number != 0) {
            number = number / 10;
            ret++;
        }

        return ret;
    }

    public int func_c(int number, int digit) {
        int ret = 0;

        for(int i = 0; i < digit; i++) {
            int temp = number % 10;
            number = number / 10;
            ret = ret * 10 + temp;
        }

        return ret;
    }

    public int solution(int number) {
        int answer = 0;
        int digit = func_b(number);
        int convert_number = func_c(number, digit);
        answer = func_a(number, convert_number);
        return answer;
    }

    public static void main(String[] args) {
        Solution68 sol = new Solution68();
        int number1 = 120;
        int ret1 = sol.solution(number1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int number2 = 23;
        int ret2 = sol.solution(number2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
