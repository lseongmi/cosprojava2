package cospro;

public class Solution9 {
    public String solution(String characters){

        String result = "";
        result += characters.charAt(0);
        for (int i = 1; i < characters.length(); i++) {
            if (characters.charAt(i - 1) != characters.charAt(i))
                result += characters.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        String characters = "senteeeencccccceeee";
        String ret = sol.solution(characters);


        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
