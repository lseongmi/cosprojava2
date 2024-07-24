package thirdExam.Fifthexam3;
class Solution2 {
    public int solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++){
                if (arr[i]%2 == 0 && arr[i]/2 != arr[j]) {
                    answer++;
                }
                break;
            }
        return answer;
    }
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] arr = {4, 8, 3, 6, 7};
        int ret = sol.solution(arr);
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}