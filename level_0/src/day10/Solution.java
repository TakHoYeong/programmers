package day10;

/* 문자열 뒤의 n글자 */
public class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(my_string.length()-n);
        return answer;
    }
}