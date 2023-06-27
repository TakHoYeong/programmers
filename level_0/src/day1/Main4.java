package day1;

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
