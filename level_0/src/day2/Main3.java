package day2;

import java.util.ArrayList;
import java.util.Scanner;

/* 문자열 돌리기 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int result = a.length();

        for (int i=0; i<result; i++){
            System.out.println(a.charAt(i));
        }
    }
}
