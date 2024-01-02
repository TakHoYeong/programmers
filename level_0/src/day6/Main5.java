package day6;

import java.util.Arrays;

/* 수력와 구간 쿼리 2 */
public class Main5 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);
        for (int i=0; i<queries.length; i++){
            for (int j=queries[i][0]; j <= queries[i][1]; j++){ // s <= i <= e의 조건을 for문을 이용해 충족
                if(arr[j] > queries[i][2]){ // i > k 의 조건
                    if (answer[i] > arr[j])
                        answer[i] = arr[j];
                }
            }
            if (answer[i] == Integer.MAX_VALUE) answer[i] = -1;
        }
        return answer;
    }
}
