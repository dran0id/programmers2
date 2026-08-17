public class StringSearch {
    public static void main(String[] args) {
        /**
         * 문자열안에 문자열
         *
         * 문자열 str1, str2가 매개변수로 주어집니다.
         * str1 안에 str2가 있다면 1을 없다면 2를 return하도록
         * solution 함수를 완성해주세요.
         */
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(solution(str1, str2));
    }

    static int solution(String str1, String str2) {
        if (str1.contains(str2)) {
            return 1;
        } else {
            return 2;
        }
    }
}
