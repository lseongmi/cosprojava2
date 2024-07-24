package secondexam3;

import java.util.*;

class Solution2 {
    public int solution(String[] words, String word) {
        int count = 0;

        // Iterate through each word in the words array
        for (String w : words) {
            // Iterate through each character in the current word
            for (int j = 0; j < word.length(); j++) {
                // Compare characters at the same position
                if (w.charAt(j) != word.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        String[] words = {new String("CODE"), new String("COED"), new String("CDEO")};
        String word = new String("CODE");
        int ret = sol.solution(words, word);

        // Print the result
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
