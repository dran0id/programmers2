import java.util.Arrays;

public class StringLengthProcessor {
    public static void main(String[] args) {
        /**
         * 배열 원소의 길이
         *
         * 문자열 배열 strlist가 매개변수로 주어집니다
         * strlist 각 원소의 길이를 담은 배열을 return하도록
         * solution 함수를 완성해주세요.
         */
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution(strlist)));
    }

    static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}
