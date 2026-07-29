public class VowelRemover {
    public static void main(String[] args) {
        /**
         * 모음 제거
         *
         * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
         * 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록
         * solution 함수를 완성해주세요.
         */
        String my_string = "nice to meet you";
        System.out.println(solution(my_string));
    }

    static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
