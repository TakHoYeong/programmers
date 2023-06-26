package day1;

/* 문자열 반복해서 출력하기 */

// 문자열과 반복할 횟수를 입력받아 문자열 출력
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.print(str);
        }
    }
}
