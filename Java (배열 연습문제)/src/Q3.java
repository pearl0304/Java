import java.util.Scanner;

public class Q3 {
    //배열 answer에 담긴 데이터를 읽고 각 숫자의 갯수를 세어 개수만큼 '*'을 찍어서 그래프를 그리는 프로그램을 작성하시오
    public static void main(String args[]) {

        int answer[];

        int 배열크기;

        Scanner s = new Scanner(System.in);
        // 1. 배열 생성하기

        System.out.printf("생성할 배열의 크기를 입력하세요 : ");

        배열크기=s.nextInt();

        answer=new int[배열크기];


        // 2. 배열 원소 입력하기

        for(int i=0 ; i<answer.length;i++){

            System.out.printf("배열 [%d]의 값을 입력하세요 : ",i);

            answer[i]=s.nextInt(); //빼먹지 말기

        } System.out.println();


        //3. 그래프 만들기

        System.out.println("입력하신 값으로 그래프를 그립니다");

        for(int i=0 ; i<answer.length;i++){

            if(i<10){

                System.out.printf("배열 [%d] 번지 : ",i);

            }else{

                System.out.printf("배열 [%d] 번지 : ",i);

                System.out.println();
            }

            for(int j=0 ; j<answer[i];j++){

                System.out.print('*');
            }
            System.out.println();

        }

    }
}
