import java.util.Scanner;

public class 중첩1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		
		int a;
		a=s.nextInt();
		
		
		
		if (a % 3==0) {
			if(a % 4==0) {
				System.out.println("12의 배수입니다");}
				else { 
					System.out.println("3의 배수입니다");
					}}
			else {
					System.out.println("3의배수가 아닙니다");
				}
			}
}

		
		
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.println("정수를 입력하시오");
		a=s.nextInt();
		
		if (a<0) {
			System.out.printf("입력한 값의 절대값은 %d입니다 \n",a*-1);
		}else {System.out.printf("입력한 값의 절대값은 %d입니다 \n",a);
		}			
}
}
		*/
		
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.println("점수를 입력하시오");
		a=s.nextInt();
		
		if(a>=90) {
			System.out.printf("A");
		}else if(a>=80) {
				System.out.printf("B");	
		}else if(a>=70) {
				System.out.printf("C");
		}else if(a>=60) {
				System.out.printf("D");
		} else 
		{System.out.printf("F");
		}
		
		System.out.printf("학점입니다\n");
			
		}
}
	
		