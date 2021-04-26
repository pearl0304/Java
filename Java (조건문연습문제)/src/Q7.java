import java.util.Scanner;

public class Q7 {

    //#7 주어진 문자열이 있을 때 문자열 내에 숫자가 있는지 판별하는 프로그램을 작성하시오
    public static void main(String args[]) {

        String a;

        Scanner s = new Scanner(System.in);

        boolean b = false; //숫자가 없다

        System.out.printf("문자를 입력하세요 : ");

        a = s.nextLine();

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {

                System.out.printf("%d번째 자리는 숫자 \n", i);

            } else b = true; // b= 숫자가 없다

        }

        if (b == false) { // 숫자가 없다는게 맞다면

            System.out.printf("입력하신 문자 %s에는 숫자가 없습니다", a);

        } else {

            System.out.printf("입력하신 문자 %s에는 숫자가 있습니다", a);

        }
    }
}
