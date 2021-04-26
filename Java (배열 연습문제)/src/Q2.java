import java.util.Scanner;

public class Q2 {

    // 2차원 배열에 담긴 모든 값을 더하고 평균을 내는 프로그램을 작성하시오
    public static void main(String args[]) {

        int arr[][] = new int[2][3];

        int sum=0;

        int row=arr.length;

        int col=arr[0].length;

        Scanner s = new Scanner(System.in);

        for(int i=0 ; i<row ; i++){

            for (int j=0 ; j<col ; j++){

                System.out.printf("숫자를 입력하세요 : ");

                arr[i][j]=s.nextInt();

                sum=sum+arr[i][j];
            }

        } System.out.printf("원소의 합: %d \n",sum);

        System.out.printf("원소의 평균 : %d",(sum/(row*col)));
    }
}
