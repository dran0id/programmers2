public class RemoveLetter {
    public static void main(String[] args) {
        /*
         * 특정 문자 제거
         *
         * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
         * my_string에서 letter를 제거한 문자열을 return하도록
         * solution 함수를 완성해주세요.
         */
        String my_string = "asdfghj";
        String letter = "qwertyuio";
        System.out.println(solution(my_string, letter));
    }

    static String solution(String my_string, String letter) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {

            String current_letter = my_string.substring(i, i + 1);

            if (!current_letter.equals(letter)) {
                answer += current_letter;
            }
        }
        return answer;
    }
}
