import java.util.Scanner;

public class Q6 {

    //#6 피보나치 수열 (입력한 값까지의 합계)
    public static void main(String args[]){

        int num1 =1;

        int num2 =1;

        int num3;

        int sum=0;

        int l;

        Scanner s = new Scanner(System.in);

        System.out.printf("원하는 위치값을 입력하시오 : ");

        l=s.nextInt();

        System.out.printf("%d %d ",num1,num2);

        for(int i=0 ; i<l; i++) {

            num3 = num1 + num2;

            sum = num1;

            System.out.printf("%d ", num3);

            num1 = num2; // 원래 두번째 자리에 있던 수를 첫번째로 옮기기

            num2 = num3; // 원래 세번째 자리에 있던 수를 두번째로 옮기기

        }

        System.out.println();

        System.out.printf("%d까지의 합은 %d",l,sum);
    }
}
