import java.util.Scanner;

public class Q1 {

    // #1 int형 변수가 10보다 크고 20보다 작을 때 참인 조건식
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);

        int a;

        System.out.print("정수를 입력하세요 : ");
        a= s.nextInt();

        if(a>=10 && a<=20){

        System.out.print(true);

        } else{System.out.print(false);

        }
    }
}



