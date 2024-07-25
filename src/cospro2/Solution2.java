package cospro2;

public class Solution2 {
        public int func_a(int[] currentGrade, int[] lastGrade, int[] rank, int maxDiffGrade) {
            int arrLength = currentGrade.length;
            int count = 0;
            for (int i = 0; i < arrLength; i++) {
                if (currentGrade[i] >= 80 && rank[i] <= arrLength / 10)
                    count++;
                else if (currentGrade[i] >= 80 && rank[i] == 1)
                    count++;
                else if (maxDiffGrade == currentGrade[i] - lastGrade[i])
                    count++;
            }
            return count;
        }

        public int[] func_b(int[] currentGrade) {
            int arrLength = currentGrade.length;
            int[] rank = new int[arrLength];
            for (int i = 0; i < arrLength; i++)
                rank[i] = 1;
            for (int i = 0; i < arrLength; i++)
                for (int j = 0; j < arrLength; j++)
                    if (currentGrade[i] < currentGrade[j])
                        rank[i]++;
            return rank;
        }

        public int func_c(int[] currentGrade, int[] lastGrade) {
            int maxDiffGrade = 1;
            for (int i = 0; i < currentGrade.length; i++) {
                if (maxDiffGrade < currentGrade[i] - lastGrade[i])
                    maxDiffGrade = currentGrade[i] - lastGrade[i];
            }
            return maxDiffGrade;
        }
    public int solution(int[] currentGrade, int[] lastGrade) {
        int[] rank = func_b(currentGrade);
        int maxDiffGrade = func_c(currentGrade, lastGrade);
        int answer = func_a(currentGrade, lastGrade, rank, maxDiffGrade);
        return answer;
    }
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] currentGrade = {70, 100, 70, 80, 50, 95};
        int[] lastGrade = {35, 65, 80, 50, 20, 60};
        int ret = sol.solution(currentGrade, lastGrade);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
