package day2;

/* 문자열 겹쳐쓰기 */
public class Main5 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String str = my_string.substring(0,s);
        String overstr = my_string.substring(s+overwrite_string.length());
        answer = str + overwrite_string + overstr;

        return answer;
    }
}
