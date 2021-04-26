public class Q1 {

    //#1 1~20까지의 정수에서 2의 배수와 3의 배수의 정수 합을 구하시오.
    public static void main(String args[]) {
        int sum=0;

        for(int i=1 ; i<=20 ; i++){

            if((i%2==0) && (i%3==0)){

                sum=sum+i;

                System.out.print("2와 3의 공배수:");

                System.out.print(i);

                System.out.println();
            }
        } System.out.printf("2와 3의 공배수의 합은 : %d",sum);
    }
}
