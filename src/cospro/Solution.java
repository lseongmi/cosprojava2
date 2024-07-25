package cospro;
import java.util.*;

class Solution {

public int[] solution(String[] shirtSize) {

        int[] answer = new int[shirtSize.length];

        for(int i = 0; i < shirtSize.length; i++) {
        if(shirtSize[i].equals("XS")) answer[0]++;
        else if(shirtSize[i].equals("S")) answer[1]++;
        else if(shirtSize[i].equals("M")) answer[2]++;
        else if(shirtSize[i].equals("L")) answer[3]++;
        else if(shirtSize[i].equals("XL")) answer[4]++;
        else if(shirtSize[i].equals("XXL")) answer[5]++;

        }
        return answer;
}

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        int[] ret = sol.solution(shirtSize);

        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}

