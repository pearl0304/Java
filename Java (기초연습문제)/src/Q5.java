import java.util.Scanner;

public class Q5 {

    //#5 char형 변수가 영문자 (대문자 or 소문자)일 때 참인 조건식
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        char a;

        System.out.print("문자를 입력하세요 : ");

        a = s.nextLine().charAt(0);

        if ((a>='a'&& a<='z')||(a>='A'&& a<='Z')) {

            System.out.print(true);

        } else {

            System.out.print(false);
        }
    }
}
