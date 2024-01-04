package day8;

/* 9로 나눈 나머지 */
public class Main4 {
    public int solution(String number) {
        String[] num_list = number.split("");
        int answer = 0;
        for (int i=0; i<num_list.length; i++){
            answer += Integer.parseInt(num_list[i]);
        }
        answer %= 9;
        return answer;
    }
}
