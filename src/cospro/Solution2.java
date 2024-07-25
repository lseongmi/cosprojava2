package cospro;
import java.util.*;

class Solution2 {
    public int solution(int price, String grade) {

        int answer = 0;
        if(grade.equals("S")) answer = (int)(price * 0.95);
        if(grade.equals("V")) answer = (int)(price * 0.9);
        if(grade.equals("G")) answer = (int)(price * 0.85);
        return answer;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);

        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);

        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}