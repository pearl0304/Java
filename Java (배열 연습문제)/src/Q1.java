import java.util.Scanner;

public class Q1 {
    // 1차원 배열 arr에 담긴 모든 값을 더하는 프로그램을 작성하시오
    // 스캐너로 1차원 배열 입력받기
    public static void main(String args[]) {

        int arr[] = new int[3];

        int sum=0;

        Scanner s =new Scanner(System.in);

        for(int i=0 ; i<arr.length; i++){

            System.out.printf("숫자를 입력하세요 : "); //지정한 수 만큼 입력 받기

            arr[i]=s.nextInt();

            sum=sum+arr[i];

        }System.out.printf("배열의 합:%d",sum);
    }
}
