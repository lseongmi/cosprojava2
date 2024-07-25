package cospro;

public class Solution5 {
    public int[] solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }
        return arr;
    }


    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int[] arr = {1, 4, 2, 3};
        int[] ret = sol.solution(arr);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
