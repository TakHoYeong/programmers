package day8;

/* 글자 이어 붙여 문자열 만들기 */
public class Main3 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for (int i=0; i<index_list.length; i++){
            answer += arr[index_list[i]];
        }
        return answer;
    }
}
