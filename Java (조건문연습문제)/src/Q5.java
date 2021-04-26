import java.util.Scanner;

public class Q5 {

    //#5 숫자로 이루어진 문자열이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하시오
    //예) 문자열이 1234 ==> 1+2+3+4 =10
    public static void main(String args[]) {
        int a;

        Scanner s= new Scanner(System.in);

        int sum=0;

        System.out.printf("숫자열을 입력하시오 : ");

        a=s.nextInt();

        while (a>0){

            sum=sum + a%10;

            a=a/10;

        } System.out.println(sum);

    }
}
