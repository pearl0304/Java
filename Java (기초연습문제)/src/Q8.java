import java.util.Scanner;

public class Q8 {

    //#8 문자열 참조변수 str이 "yes"일 때 참인 조건식
    public static void main(String args[]) {

        String str="yes";

        Scanner s = new Scanner(System.in);

        System.out.printf("문장을 입력하세요 : ");

        str=s.nextLine();

        if(str.equals("yes")) {

            System.out.print(true);

        }else {System.out.print(false);

        }

    }
}
