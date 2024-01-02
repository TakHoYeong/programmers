package day6;

/* 수열과 구간 쿼리 3 */
public class Main4 {
    public int[] solution(int[] arr, int[][] queries) {
        int tmp;
        for (int i=0; i<queries.length; i++) {
            tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        return arr;
    }

    /**
     * tmp = 0
     * 0 = 3
     * 3 = 0
     * **/
}
