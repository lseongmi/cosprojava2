package exam;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 문제2) "abcde" 문자열을 거꾸로 출력하시오
///////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Solution2 {
    public String solution(String characters[]) {
//        String result = "";
        // here coding
        //문자열 부분
//        for (int i = characters.length() - 1; i >= 0; i--) {
//            result += characters.charAt(i);
//        }

//        return result;
        //1번 배열 풀이
//            char[] arr = characters.toCharArray();
//            int n = arr.length;
//
//            for(int i = 0; i < n/2; i++) {
//                char temp = arr[i];
//                arr[i] = arr[n -1 -i];
//                arr[n -1 -i] = temp;
//            }
//            return new String(arr);

        //2번 배열 풀이
        String str = characters[0];

        // 문자열을 문자 배열로 변환
        char[] charArray = str.toCharArray();

        // 문자를 뒤집음
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }


    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        String characters[] = {"abcde"};
        String ret = sol.solution(characters);
        System.out.println("Solution: return value of the method is " + ret + " .");
    }

}
