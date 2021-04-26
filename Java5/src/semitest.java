import java.util.Scanner;

public class semitest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 /* 예상답 ) 12 true AB 12 12 Java error 
		
		System.out.println("1"+"2"); //문장
		System.out.println("true"+""); //문장
		System.out.println('A'+'B'); //문자
		System.out.println('1'+2); //문자
		System.out.println('1'+'2'); //문자
		System.out.println('J'+"ava"); //문장 
		//System.out.println(true+null); 
		
		System.out.println("A"+"B");
		
		System.out.println((int)'A'); //65 (내부적으로 정수 처리=코드값) ★문자는 코드값(정수)으로 처리함
		System.out.println((int)'B'); //66 
		System.out.println((int)'1'); //49
		System.out.println((int)'2'); //50 
		
		//사과를 담는데 필요한 바구니의 수를 구하는 프로그램을 만들시오
		//사과의 수를 입력받기 , 바구니당 최대 담을 수 있는 사과수 정의 , 바구니 개수 출력 
		
		
	 Scanner s = new Scanner(System.in);
	 int max;
	 int apple;
	 
	 System.out.printf("최대 바구니 수 : ");
	 max = s.nextInt();
	 
	 System.out.printf("사과의 갯수를 입력하시오 : ");
	 apple = s.nextInt();
	 
	 if((apple % max) == 0 ){
	 System.out.printf("%d개\n",apple/max);}
	 else{
	 System.out.printf("%d개\n",(apple/max)+1);
	 } 
		
	// 입력한 정수 변수 값에 따라 '양수' '음수' '0을 출력하는 프로그램을 작성하시오. 실수값을 입력할 경우 정상적으로 시스템이 종료될 수 있도록 /

		
		int a;
		Scanner s = new Scanner (System.in);
		System.out.printf("정수를 입력하시오 : ");
		
		try {
			
			a=s.nextInt();
			
		if(a>=0) {
			if(a>0) {
			System.out.printf("%d는 양수입니다.",a);}
			else {System.out.printf("%d는 0입니다.",a);}
			}
		else{
			System.out.printf("%d는 음수입니다.",a);	
		}
		} catch(Exception e) {
			System.out.printf("잘못 입력하셨습니다");
			
			s.next(); //s값 리셋하여 다음 값을 받도록 함. 만약에 없으면 무한 루프에 걸릴 수 있음.
		}

		
		// 제어문을 활용하여 방정식의 2x+4y=10의 모든 양의 해를 구하시오 
		
		System.out.println("2x +4y =10의 양의 해 구하기");
		
		int x;
		int y;
		
		for(x=0;x<=10;x++) {
			for(y=0;y<=10;y++) {
			if((2*x)+(4*y)==10) // <- 내가 몰랐던 거 
				System.out.printf("x= %d, y=%d \n", x,y);}
		}*/
		
		//0에서 100사이의 값을 랜덤하게 설정하고 설정된 값 맞추면 종료되는 미니 게임을 구현하시오
		//(int)(Math.random()*100
		
		
		int a=0;
		int b=0;
		int count=0;
		
		a = (int)(Math.random()*100);
		Scanner s = new Scanner(System.in);
		

		while(true){
			System.out.printf("0~100 사이의 정수를 입력하시오 : ");
			b=s.nextInt();
			count++;
			
			if(b<a) {
			System.out.println("입력한 정수값이 작습니다.");
			}
			else if(b>a) {
				System.out.println("입력한 정수값이 큽니다.");
			}
			
			else {System.out.println("입력한 값이 맞습니다.");
				System.out.printf("총 %d회만에 맞췄습니다.",count);
				break;} //while 문 안에서 break; 
			
		} 
	
		
		//사과를 담는데 필요한 바구니의 수를 구하는 프로그램을 만들시오
		//사과의 수를 입력받기 , 바구니당 최대 담을 수 있는 사과수 정의 , 바구니 개수 출력 
		
		
		int aa;
		int bb;
		Scanner ss = new Scanner(System.in);
		aa=(int)
		
		System.out.printf("사과의 수를 입력하세요 : ");
		
				
			}
		}
		
		


	

