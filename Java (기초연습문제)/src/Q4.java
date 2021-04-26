import java.util.Scanner;

public class Q4 {

    //#4 char형 변수가 숫자 ('0'~'9')일 때 참인 조건식
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        char a;

        System.out.print("숫자를 입력하세요 : ");
        a = s.nextLine().charAt(0);

        if (a>='0'&& a<='9') {

            System.out.print(true);
        } else {

            System.out.print(false);
        }
    }
}
