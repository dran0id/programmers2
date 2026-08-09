import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        /**
         * 문자열 붙여서 출력하기
         *
         * 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
         * str1과 str2을 이어서 return하도록 solution 함수를 완성해주세요.
         */
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        // solution 함수의 결과를 받아 출력합니다.
        System.out.print(solution(str1, str2));
    }

    // 프로그래머스에 제출할 때는 이 solution 함수 내부만 작성하면 됩니다.
    static String solution(String str1, String str2) {
        String answer = str1 + str2;
        return answer;
    }
}