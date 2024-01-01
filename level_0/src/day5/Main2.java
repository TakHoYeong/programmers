package day5;

/* 등차수열의 특정한 항만 더하기 */
public class Main2 {
    public int solution(int a, int d, boolean[] included) {
        int answer =0;
        for (int i =0; i < included.length; i++){
            if (included[i-1] == true)
                answer += (a + (i-1)*d);
        }
        return answer;
    }
}
