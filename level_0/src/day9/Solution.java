package day9;

/* 배열 만들기 5 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (int i=0; i< intStrs.length; i++){
            int result = Integer.parseInt(intStrs[i].substring(s,s+l));
            if (result > k){
                answer.add(result);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
