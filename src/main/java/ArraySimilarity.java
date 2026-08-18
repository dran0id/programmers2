import java.util.HashSet;

public class ArraySimilarity {
    public static void main(String[] args) {
        /**
         * 배열의 유사성
         * 두 배열이 얼마나 유사한지 확인해보려고 합니다.
         * 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
         */
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution(s1, s2));
    }

    static int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> set = new HashSet<>();
        for (String str : s1) {
            set.add(str);
        }
        for (String str : s2) {
            if (set.contains(str)) {
                answer++;
            }
        }
        return answer;
    }
}
