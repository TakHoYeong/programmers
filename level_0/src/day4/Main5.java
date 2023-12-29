package day4;
/* flag에 따라 다른 값 반환하기 */
public class Main5 {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
