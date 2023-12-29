package day3;

/* 두 수의 연산값 비교하기 */
public class Main5 {
    public int solution(int a, int b){
        int answer = 0;
        int ab = Integer.valueOf(""+a+b);
        int ab2 = 2*a*b;

        answer = ab > ab2 ? ab : ab2;


        return answer;
    }

}
