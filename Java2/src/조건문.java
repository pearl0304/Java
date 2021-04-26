import java.util.Scanner;
public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Scanner s = new Scanner(System.in);

		int a;
		
		System.out.println("정수를 입력하세요 : \n");
		a = (int)s.nextDouble();
	
		if(a%2==0) {
			System.out.println("짝수를 입력했군요. \n");	}
	else {
			System.out.println("홀수를 입력했군요. \n");}
		
		
	int a;
	Scanner s = new Scanner(System.in);
	
	System.out.print("정수를 입력하세요 : \n");
	
	a = s.nextInt();
	
	if ((a%3==0) && (a%7==0))
	{System.out.printf("입력하신 %d는 21의 배수입니다 \n",a);}

	
	else 
	{System.out.printf("입력하신 %d는 21의 배수가 아닙니다 \n",a);}
	
*/
	
		int b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : \n");
		
		b = s.nextInt();
		
		if ((b%4==0) && (100 !=0))
		{System.out.printf("입력하신 %d년은 윤년입니다 \n",b);}

		
		else 
		{System.out.printf("입력하신 %d년은 윤년이 아닙니다 \n",b);}	
		
	
	
	}
}


