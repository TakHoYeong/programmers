package day7;

import java.util.ArrayList;

/* 배열 만들기 2 */
public class Main2 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                result.add(i);
            }
        }
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
