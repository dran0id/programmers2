public class CaseConverter {
    public static void main(String[] args) {
        /**
         * 대문자와 소문자
         *
         * 문자열 my_string이 매개변수로 주어질 때
         * 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록
         * solution 함수를 완성해주세요.
         */
        String my_string = "cccCCC";
        System.out.println(solution(my_string));
    }

    static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(c);
            }
        }
        return answer.toString();
    }
}
