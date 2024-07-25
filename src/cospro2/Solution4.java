package cospro2;

public class Solution4 {
    public int solution(String[] words, String word) {

        int count = 0;
        for(int i =0; i < words.length; i++) {
            for(int j = 0; j < word.length(); j++) {
                if(words[i].charAt(j) != word.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        String[] words = {new String("CODE"), new String("COED"), new String("CDEO")};
        String word = new String("CODE");
        int ret = sol.solution(words, word);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
