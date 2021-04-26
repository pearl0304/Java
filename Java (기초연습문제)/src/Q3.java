import java.util.Scanner;

public class Q3 {

    //#3 char형 변수가 'x' 또는 'X'일 때 참인 조건식
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        char a;

        System.out.print("문자를 입력하세요 : ");
        a = s.nextLine().charAt(0);

        if (a == 'x' || a == 'X') {

            System.out.print(true);

        } else {

            System.out.print(false);
        }
    }
}
