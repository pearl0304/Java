import java.util.Scanner;

public class Q6 {

    //#6 int year 형으로 윤년을 찾아내는 코드
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int year;

        System.out.printf("년도를 입력하세요 : ");
        year=s.nextInt();

        if(year%400==0 || (year%4==0 && year%100!=0)) {

            System.out.printf("윤년입니다.");

        }else {

            System.out.printf("평년입니다.");
        }
    }
}
