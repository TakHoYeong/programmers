package day1;
/* 대소문자 바꿔서 출력하기 */

//입력 받은 문자열을 대문자는 소문자로 소문자는 대문자로 바꿔서 출력
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);

            if (Character.isUpperCase(x)){
                result += Character.toLowerCase(x);
            }else {
                result += Character.toUpperCase(x);
            }
        }
        System.out.print(result);
    }
}
