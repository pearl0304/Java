import java.util.Scanner;

public class for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Scanner s = new Scanner(System.in);
		int hap = 0;
		int i;
		int num =0;
		
		System.out.println("값을 입력하시오 : ");
		num = s.nextInt();
		
		for(i=1; i<=num;i++) {
			hap=hap+i;
		}
		System.out.printf("1에서 %d까지의 합 :%d \n",num,hap);
	
		
		Scanner s = new Scanner(System.in);
		int hap = 0;
		int i;
		int num =0;
		
		System.out.println("값을 입력하시오 : ");
		num = s.nextInt();
		
		for(i=1; i<=num;i++) {
			hap=hap+i;
		}
		System.out.printf("1에서 %d까지의 평균 :%d \n",num,hap/num);
	
	
		
		
		int hap =0;
		int i;
		
		for(i=1; i<=10; i++) {
			hap=hap+i;
		}
		System.out.printf("1에서 10까지의 합은 %d",hap);
		
		
	System.out.println();	
		
		//500부터 1000까지 홀수의 합
		
		int sum=0;
		int a;
		
		for(a=501; a<=1000; a=a+2) {
			sum =sum+a;
		}
		
		System.out.printf("500에서 1000까지 홀수의 합은 %d",sum);
		
		
System.out.println();	

//현재까지 입력한 값들의 합 구하기

		Scanner s= new Scanner(System.in);
		int h=0; // 숫자들의 합
		int b;   // 숫자 
		int num=0;  // 입력한 숫자들 

		System.out.println("값을 입력하시오 : ");
		num=s.nextInt();
		
		for(b=1; b<=num; b++) {
			h=num+b;
		}
		
		System.out.printf("1에서 %d까지의 합은 %d",num,hap)


		
		Scanner ss= new Scanner(System.in);
		int hap=0;
		int i;
		int num1,num2,num3;
		
		System.out.println("시작값 입력 : ");
		num1=ss.nextInt();
		
		System.out.println("끝값 입력 : ");
		num2=ss.nextInt();
		
		System.out.println("증가값 입력 : ");
		num3=ss.nextInt();
		
		for(i=num1; i<=num2; i=i+num3) {
			hap=hap+i;
		}
		
		System.out.printf("%d에서 %d까지의 %d 증가한 값은 %d입니다 \n",num1,num2,num3,hap);
		
		ss.close();
		
		
		
		//중첩 for문 
		
		int a,b;
		int c=0;
		
		for(a=0; a<3; a++) {
			for(b=0; b<2; b++) {
				System.out.printf("i값: %d, k값:%d, 반복횟수:%d \n",a,b,c=c+1);
				
			}	
		}
		
		    
	
System.out.println();
		
		// 구구단 
		
//		int i,k;
//		
//		for(i=2;i<=9;i++) {
//			for(k=1;k<=9;k++) {
//				System.out.printf("%d x %d = %d \n",i,k,i*k);
//			}
//			System.out.println();
//		}
	
		
		int m,n;
		
		for(m=1;m<=9;m++) {
			for(n=2;n<=9;n++) {
				System.out.printf("%d x %d= %d \t",n,m,n*m);
			}
			System.out.println();
		}

		Scanner s= new Scanner(System.in);
		int a,b;
		
		
		for( ; ;) {
			System.out.printf("더할 첫 번째 수 입력 : \n");
			a=s.nextInt();
			
			System.out.printf("더할 두 번째 수 입력 : \n");
			b=s.nextInt();
			
			int c= a+b;
			System.out.printf("%d + %d = %d \n",a,b,c);
			System.out.println();
			
			
			if(c==100)
				break;
			
			
		}
		
		Scanner s= new Scanner(System.in);
		int a,b;
		char c;
		
		
		for( ; ;) {
			
			System.out.println("----두 수의 덧셈 계산기-----");
			System.out.println("실행 하시겠습니까? (y/n)");
		
			c=s.next().charAt(0); //s.next() ==> 문장을 입력받아서 처리해준다 
								// charAt(n) ==> 입력받은 문장에서 n+1번째 글자를 추출한다 
 			
			if(c=='y')
			
			System.out.printf("더할 첫 번째 수 입력 : \n");
			a=s.nextInt();
			
			System.out.printf("더할 두 번째 수 입력 : \n");
			b=s.nextInt();
			
		
			System.out.printf("%d + %d = %d \n",a,b,a+b);
			System.out.println();
			
			
			if(c!='y')
				break;
			
			
		
		int i =1;
		int j=1;
		int hap=0;
		
		while(j<=10) {
			while (i<=10) {
				hap=hap+i;
				i++;
				}
			j++;
			i=0;
		}
			System.out.println(hap);
			
			
			*/
		

	int i =1;
	int j=1;
	
	while(j<10) {
		System.out.printf("[%d]단 입니다.\n",j);
		while(i<10) {
			System.out.printf("%d x %d = %d \n ",i,j,i*j);
			i++;
		}
		j++;
		i=1;
	}
	
	}
}

	

