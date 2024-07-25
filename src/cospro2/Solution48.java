package cospro2;

public class Solution48 {
    public int solution(int n, int[] votes) {

        int[] arr = new int[n+1];
        for(int i=0; i<votes.length; i++) {
            arr[votes[i]]++;
        }
        for(int i=1; i<n+1; i++)
            if(arr[i] > votes.length/2)
                return i;
        return -1;
    }
    public static void main(String[] args) {
        Solution48 sol = new Solution48();
        int n1 = 3;
        int[] votes1 = {1, 2, 1, 3, 1, 2, 1};
        int ret1 = sol.solution(n1, votes1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int[] votes2 = {2, 1, 2, 1, 2, 2, 1};
        int ret2 = sol.solution(n2, votes2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
