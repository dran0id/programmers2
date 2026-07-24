package org.example;

public class StringRepeater {
    public static void main(String[] args) {
        /*
         * 문자열 반복 출력하기
         *
         * 문자열 my_string과 정수 n이 매개변수로 주어질 때
         * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록
         * solution 함수를 완성해보세요.
         */
        String my_string = "hello";
        int n = 5;
        System.out.println(solution(my_string, n));
    }

    static String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            //문자열 처음부터 끝까지 한 글자씩 차례대로 검사
            char c = my_string.charAt(i);
            // 현 순번대로(i대로) 글자를 하나 꺼내서 c로 저장함
            for (int j = 0; j < n; j++) {
                answer += c;
            }
            //3번 c에 넣은 문자 n번 반복
        }
        return answer;
    }
}
