public class Q2 {

    //#2 1 (1 2) (1 2 3 ) ··· (1 2 3 ··· 10) 형식으로 출력하는 코드 작성
    public static void main(String args[]) {
        int sum=0;

        for(int i=0; i<=10; i++){

            for(int j=0; j<=i;j++){ //내가 몰랐던 부분

                System.out.printf("%d \t",j);

            }System.out.println();
        }
    }
}
