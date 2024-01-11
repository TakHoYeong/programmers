package day10;

/* 접미사인지 확인하기 */
public class Solution3 {
    public int solution(String my_string, String is_suffix) {
        if(my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}
