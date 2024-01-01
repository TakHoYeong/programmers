package day5;

/* 원소들의 곱과 합 */
public class Main4 {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiply = 1;
        int square = 0;
        int sum = 0;
        for(int i=0; i < num_list.length; i++){
            multiply *= num_list[i];
            sum += num_list[i];
        }
        square += Math.pow(sum, 2);
        if(multiply < square)
            answer = 1;

        return answer;
    }
}
