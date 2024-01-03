package day7;

import java.util.ArrayList;

/* 배열 만들기 4 */
public class Main5 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for (int i=0; i<arr.length;){
            if (stk.size() == 0){
                stk.add(arr[i]); i++;
            } else if (stk.size() != 0 && stk.get(stk.size() - 1)< arr[i]) {
                stk.add(arr[i]); i++;
            }else {
                stk.remove(stk.size()-1);
            }
        }
        return stk.stream().mapToInt(i -> i).toArray();
    }
}
