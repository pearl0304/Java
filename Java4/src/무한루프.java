import java.io.IOException;
import java.util.Scanner;

public class 무한루프 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
/*Scanner s = new Scanner(System.in);

int a=0, b=0;

while(true){
	
	try {
	
	System.out.printf("첫번째 수 입력 : ");
	a=s.nextInt();
	
	System.out.printf("두번째 수 입력 : ");
	b=s.nextInt();
	
	} catch(InputMismatchException e) {
		
		System.out.println("입력 값에 오류가 있습니다");
	} finally {
		System.out.printf("%d + %d = %d \n",a,b,a+b);
		System.out.println();
		a=0; b=0;
		if(a==0 || b==0)
		break;
	}
	
	

		

			Scanner s = new Scanner(System.in);
			int a,b;
			char ch;
			
			while(true) {
				System.out.printf("첫번째 수 입력 : ");
				a=s.nextInt();
				
				System.out.printf("두번째 수 입력 : ");
				b=s.nextInt();
				
				System.out.printf("계산할 연산자 : ");
				ch=(char)System.in.read(); //
				
			switch(ch) {
			case '+' : 
				System.out.printf("%d + %d = %d \n",a,b,a+b);break;
			case '-' : 
				System.out.printf("%d - %d = %d \n",a,b,a-b);break;		
			case '*' : 
				System.out.printf("%d * %d = %d \n",a,b,a*b);break;
			case '%' : 
				System.out.printf("%d % %d = %d \n",a,b,a%b);break;
			default : 
			 System.out.printf("연산자를 잘못입력했음 \n");
				
			
			}
		
	}
 //대문자는 소문자로 소문자는 대문자로 System.in 으로 
		
		int n;
		char c;
		
		System.out.println("대문자 입력 : ");
		c= (char)System.in.read();

		System.out.print((int)c);
		
		if(c>=65 && c<=91)
		c=(char)(c+32);
		System.out.println(c);
		}else{
				System.out.println(c);	
			}
			
	
		int count=0;
		int n;
		Scanner s = new Scanner(System.in);
		int temp=0;
		
		do {
			
			System.out.printf("메뉴를 선택해 주세요 : ");
			
			if(count==0) {
			System.out.print("\n1.카푸치노   2.카페라떼   3. 아메리카노");
			} else {System.out.print("1.카푸치노   2.카페라떼   3. 아메리카노  4.Stop");
			}
		
		n=s.nextInt();
		
		if(n==4 && count==0) {
			temp = n+1;}
		else {temp=n;}
			
		
		
		switch(temp) {
		case 1 : 
			System.out.printf("카푸치노 선택");
			count++;
			break;
			
		case 2 : 
			System.out.printf("카페라떼 선택");
			count++;
			break;
		case 3 : 
			System.out.printf("아메리카노 선택");
			count++;
			break;
			
		case 4 : 
			System.out.printf("주문하신 커피가 나왔습니다");
			count++;
			break;
			
			default :
				System.out.printf("잘못주문하셨습니다");	
			}
		
		
		} while(n!=4 && count!=0);
		
		
		
		
		int hap =0;
		int i;
		
		for(i=1; i<=100; i++) {
			hap= hap+i;
			
			if(hap>=1000) break;
		}
		
		System.out.printf("1~100의 합에서 최초로 1000이 넘는 위치는 : %d \n",i);
		
		
		int hap=0;
		int i;
		
		for(i=1; i<=100; i++) {
			if(i%3==0) 
				continue;
			hap = hap+i;
		}
			System.out.printf("1~100의 합(3의 배수 제외): %d \n",hap);
			
		}
		*/
		
		
		
		int hap=0;
		int i;
		
	
		
		for(;;) {
			for(i=1; i<=100; i++) {
			hap = hap+i;
			
				if(hap>2000) {
					System.out.printf("%d \n",hap);
					hap=0;
					return;
			}
			
		
			System.out.printf("아직도 반복 %d \n",hap);
			
		}
		}
	
		
		
		
		
	}
}
		

		


		