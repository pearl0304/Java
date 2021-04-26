public class Q3 {

    //#3 1+(-2)+3+(-4) ···의 형태로 식이 계속 진행될 때 얼마까지 더해야 합이 100이 넘는지 구하시오
    public static void main(String args[]) {

        int num,sum=0;

        int s=1; // 부호설정을 위한 변수 선언

        for(int i=1; true; i++,s=s*-1){

            num=i*s; //< 내가 몰랐던 부분

            sum=sum+num;

            System.out.printf("현재 수 : %d 현재까지 합 : %d", num,sum);

            System.out.println();

            if(sum>=100) break;;

        } System.out.printf("마지막 수 : %d \n",num);

        System.out.printf("총 합 : %d \n",sum);

    }
}
