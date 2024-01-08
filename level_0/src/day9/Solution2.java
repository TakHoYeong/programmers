package day9;

/* 부분 문자열 이어 붙여 문자열 만들기 */
public class Solution2 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0; i< my_strings.length; i++){
            String str = my_strings[i];
            answer += str.substring(parts[i][0], parts[i][1]+1);
        }
            return answer;
    }
}
