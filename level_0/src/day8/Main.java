package day8;
/* 간단한 논리 연산 */
public class Main {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        if ((x1 == true || x2 == true) && (x3 == true || x4 == true)){
            return true;
        }else {
            return false;
        }
    }
}
