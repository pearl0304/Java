import java.util.Scanner;

public class Q2 {

    //#2 char 형 변수가 공백이나 탭이 아닐 때 참인 조건식
    public static void main(String args[]){

        Scanner s= new Scanner(System.in);
        char a;

        System.out.print("문자를 입력하세요 : ");

        a=s.nextLine().charAt(0);

        if((a==' ')|| (a=='\t')){

        System.out.println("공백 또는 탭을 입력함");

        } else {System.out.print(a);}

        }
}
