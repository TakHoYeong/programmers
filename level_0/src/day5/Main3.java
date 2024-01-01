package day5;

/* 주사위 게임 2 */
public class Main3 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a==b || a==c || b==c){
            answer = (int) ((a + b + c)*(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c,2)));
        } else if (a==b && b==c) {
            answer = (int) ((a + b + c)*(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c,2))*(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c,3)));
        }
        else answer = a + b + c;

        return answer;
    }
}
