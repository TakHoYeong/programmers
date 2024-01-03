package day7;

import java.util.ArrayList;

/* 콜라츠 수열 만들기 */
public class Main4 {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);
        while (n != 1){
            if (n%2==0){
                n = n/2;
            }
            else {
                n = 3*n+1;
            }
            answer.add(n);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
