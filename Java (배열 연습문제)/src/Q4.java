import java.util.Scanner;

public class Q4 {

    public static void main(String args[]){

        String 단어배열[] ={"tiger","bear","rabbit","wolf"};

        String 입력;

        Scanner s = new Scanner(System.in);

        //1. 단여배열에 있는 단어들을 알파벳으로 랜덤으로 쪼개기 예) cat ->'t' 'c' 'a'

        for(int i = 0; i<단어배열.length;i++){

            char 알파벳[]= 단어배열[i].toCharArray(); // 입력된 i번째 단어를 알파벳으로 분해

            for(int j=0 ; j<알파벳.length;j++){

                int 난수 = (int) (Math.random()*알파벳.length); //난수 만들기

                char tmp = 알파벳[i];

                알파벳[i]=알파벳[난수];

                알파벳[난수]=tmp;

            } // 알파벳 랜덤하게 쪼개기 for 문

            System.out.print("다음은 무슨 단어일까요? : ");

            // 2. 랜덤으로 쪼갠 알파벳 배열하기

            for(int k=0; k<알파벳.length;k++){

                System.out.print(알파벳[k]);

            }
            System.out.println();

            //3. 문제 맞추기

            while (true){

                입력=s.nextLine();

                if(입력.equals(단어배열[i])){

                    System.out.println("정답입니다"); break;

                } else {

                    System.out.println("틀렸습니다. 다시 입력하세요");

                } //else

            }//while

        }//전체 for 문 닫기
        System.out.println("모든 문제를 푸셨습니다");
    } // main
}
