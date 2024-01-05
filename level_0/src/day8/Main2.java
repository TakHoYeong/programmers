package day8;

import java.util.Arrays;

/* 주사위 게임 3 */
public class Main2 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a,b,c,d};
        Arrays.sort(dice);
        int answer = 0;

        if (dice[0] == dice[3]){ //모두 같은 수
            answer = 1111*dice[0];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) { // 세개는 같고 하나만 다른 것
            answer = (int)Math.pow(10*dice[1]+(dice[0]+dice[3]-dice[1]), 2);
        } else if (dice[0]==dice[1] && dice[2]==dice[3]) { //두개씩 같은 것
            answer = (dice[0]+dice[3]) * (dice[3]-dice[0]);
        }else if (dice[0]==dice[1]){
            answer = dice[2]*dice[3];
        } else if (dice[1]==dice[2]) {
            answer = dice[0]*dice[3];
        } else if (dice[2]==dice[3]) {
            answer = dice[0]*dice[1];
        }else {
            answer = dice[0];
        }
        return answer;
    }
}
