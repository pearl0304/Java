import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int a = 99;
		
		if (a<100)
			System.out.println("100보다 작다 \n");
		

System.out.println();

		int b = 200;
		if (b<100)
			System.out.println("100보다 작다 \n");
			System.out.println("이 문장은 안 보일껄 \n");
			System.out.println("프로그램 종료 \n");

System.out.println();
			
		int c =200;
		if (c<100) {
			System.out.println("100보다 작다 \n");
			System.out.println("이 문장은 안 보인다");
		}
		System.out.println("프로그램 끝");
		
System.out.println();		
		int d = 200;
		if (d<100)
			System.out.println("100보다 작다 \n");
		else 
			System.out.println("100보다 크다");
		
System.out.println();		
		
		int e = 200;
		
		if (e<100) {
			System.out.println("100보다 작다 \n");
			System.out.println("참이면 이 문장도 보인다");
		}
		else {
			System.out.println("100보다 크다 \n");
			System.out.println("거짓이면 이 문장이 보인다 \n");
		}
System.out.println();

			Scanner s= new Scanner(System.in);
			int f;
			
			System.out.println("정수를 입력하세요 : ");
			f=s.nextInt();
			
			if (f%2==0)
				System.out.println("짝수");
			else 
				System.out.println("홀수");
System.out.println();
			
		Scanner ss= new Scanner(System.in);
		int g;
		
		System.out.println("정수를 입력하세요 : ");
		g=ss.nextInt();
		
		if(g>=50) {
			if(a<100)
				System.out.println("50이상 100미만이다");
			else
				System.out.println("100이상이다");
		}
		
		else 
			System.out.println("50보다 작다");
System.out.println();		

		Scanner sss= new Scanner(System.in);
		int h;
		
		System.out.println("점수를 입력하시오 : ");
		h=sss.nextInt();
		
		if (h>=90) {System.out.println("A학점");}
			else if (h>=80) System.out.println("B학점");
			else if (h>=70) System.out.println("C학점");
			else if (h>=60) System.out.println("D학점");
			
		else 
			System.out.println("F학점");

		System.out.println();			
		Scanner r= new Scanner(System.in);
		int i;
		
		System.out.println("1~4 중에서 선택하세요 : ");
		i=r.nextInt();
		
		switch(i) {
		case 1 :
			System.out.println("1선택");
			break;
		case 2 :
			System.out.println("2선택");
			break;
		case 3 :
			System.out.println("3선택");
			break;
		case 4 :
			System.out.println("4선택");
			break;	
			
		default : 
			System.out.println("잘못된 선택");
		
		}
	
		
		//누적 합계 구하기 

Scanner s= new Scanner(System.in);
int h=0;
int i;
int n;

System.out.printf("값을 입력하시오 : ");
n=s.nextInt();

for(i=1; i<=n; i++) {
	h=h+i;
}

System.out.printf("1부터 %d까지의 합은 %d",n,h);

*/

		// 값을 3개의 합  
		Scanner s = new Scanner(System.in);
		int h=0;
		int n1,n2,n3;
		int i;
		
		System.out.printf("첫번째 숫자입력 : \n");
		n1=s.nextInt();
		
		System.out.printf("두번째 숫자입력 : \n");
		n2=s.nextInt();
		
		System.out.printf("세번째 숫자입력 : \n");
		n3=s.nextInt();
	
		for(i=n1; i<=n2; i=i+n3) {
			h=h+i;
			
		}
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합은 %d",n1,n2,n3,h);



	}
}