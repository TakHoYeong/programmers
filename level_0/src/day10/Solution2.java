package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();

        for (int i=0; i<my_string.length(); i++){
            String sub = my_string.substring(i, my_string.length());
            answer.add(sub);
        }
        Collections.sort(answer);

        return answer.toArray(new String[answer.size()]);
    }
}
