package day10;

/* 문자열의 앞의 n글자 */
public class Solution4 {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }
}
