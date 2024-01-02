package day6;

/* 수 조작하기 2 */
public class Main3 {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1; i<= numLog.length-1; i++) {
            if (numLog[i]-numLog[i-1] == 1)
                answer += "w";
            else if (numLog[i]-numLog[i-1] == -1)
                answer += "s";
            else if (numLog[i]-numLog[i-1] == 10)
                answer += "d";
            else if (numLog[i]-numLog[i-1] == -10)
                answer += "a";
        }
        return answer;
    }
}
