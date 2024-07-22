package exam;
////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 문제3) main에서 전달해 주는 숫자에서 1~숫자까지 각 자리수에 3,6,9의 "pair"가 나오고 그 갯수를 출력하는 프로그램의 빈칸을 채우시오
///////////////////////////////////////////////////////////////////////////////////////////////////////////


public class Solution3 {
    public int solution(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            int current = i;
            int temp = count;
            while (current > 0) {
                if (current % 10 == 3 || current % 10 == 6 || current % 10 == 9){ // 3이거나 6이거나 9인 경우 예) 3
                    count++;
                    System.out.print("pair");
                }
                current /= 10;
            }//while

            if(temp != count)
            System.out.print(i);
            System.out.print(" ");

        }//for
        System.out.println();
        return count;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int number = 40;
        int ret = sol.solution(number);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
