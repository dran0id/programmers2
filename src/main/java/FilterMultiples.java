public class FilterMultiples {
    public static void main(String[] args) {
        /**
         * n의 배수 고르기
         *
         * 정수 n과 정수 배열 numlist가 매개변수로 주어질 때
         * numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
         */
        int n = 2;
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        System.out.println(solution(n, num));
    }

    static int[] solution(int n, int[] num) {
        int abc = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % n == 0) {
                abc++;
            }
        }
        int[] ans = new int[abc];
        int bal = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % n == 0) {
                ans[bal++] = num[i];
            }
        }
        return ans;
    }
}
