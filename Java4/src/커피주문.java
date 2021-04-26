import java.util.Scanner;

public class 커피주문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//커피주문

		int menu;
		int count=0;
		Scanner s = new Scanner(System.in);

		while (true){
		    System.out.println("1. 아메리카노 \t 2. 카페라떼 \t 3. 카페모카");
		    System.out.print("메뉴를 입력하세요 (종료 : 0) : ") ;
		    menu=s.nextInt();

		    System.out.println();

		    if(menu==0){
			System.out.print("주문을 종료합니다 \n"); break;
		    } else if (1<=menu && menu<=3){
			System.out.printf("%d를 주문하셨습니다 \n",menu);
			count++;
		    } else {
			System.out.print("잘못입력했습니다\n");
			continue;
		    }System.out.println();
		} System.out.printf("총 %d잔을 주문하셨습니다\n ",count);
		
	}

}
