public class Q4 {

    //#4 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하시오
    public static void main(String args[]) {
        int sum=0;
        for(int i=1 ; i<=5 ; i++){

            for(int j=1 ; j<=5; j++){

                if((i+j)==6){
                    System.out.printf("%d + %d = %d \n",i,j,(i+j));}
            }
        }
    }
}
