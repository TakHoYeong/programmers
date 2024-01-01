package day5;

/* 이어 붙인 수 */
public class Main5 {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        for (int i=0; i< num_list.length; i++){
            if (num_list[i]%2==1){
                odd += num_list[i];
            }
            else {
                even += num_list[i];
            }
        }
        int answer = Integer.valueOf(odd) + Integer.valueOf(even);
        return answer;
    }
}
