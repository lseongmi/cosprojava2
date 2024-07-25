package cospro;

public class Solution6 {
    public int solution(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            int current = i;
            int temp = count;
            while (current != 0) {
                if (current % 10 == 3 || current % 10 == 6 || current % 10 == 9) {
                    count++;
                }
                current /= 10;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int number = 40;
        int ret = sol.solution(number);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
