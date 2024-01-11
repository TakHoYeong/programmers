package day10;

/* 접두사인지 확인하기 */
public class Solution5 {
    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)){
            return 1;
        }
        else {
            return 0;
        }
    }
}
