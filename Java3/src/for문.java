import java.util.Scanner;

public class for�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Scanner s = new Scanner(System.in);
		int hap = 0;
		int i;
		int num =0;
		
		System.out.println("���� �Է��Ͻÿ� : ");
		num = s.nextInt();
		
		for(i=1; i<=num;i++) {
			hap=hap+i;
		}
		System.out.printf("1���� %d������ �� :%d \n",num,hap);
	
		
		Scanner s = new Scanner(System.in);
		int hap = 0;
		int i;
		int num =0;
		
		System.out.println("���� �Է��Ͻÿ� : ");
		num = s.nextInt();
		
		for(i=1; i<=num;i++) {
			hap=hap+i;
		}
		System.out.printf("1���� %d������ ��� :%d \n",num,hap/num);
	
	
		
		
		int hap =0;
		int i;
		
		for(i=1; i<=10; i++) {
			hap=hap+i;
		}
		System.out.printf("1���� 10������ ���� %d",hap);
		
		
	System.out.println();	
		
		//500���� 1000���� Ȧ���� ��
		
		int sum=0;
		int a;
		
		for(a=501; a<=1000; a=a+2) {
			sum =sum+a;
		}
		
		System.out.printf("500���� 1000���� Ȧ���� ���� %d",sum);
		
		
System.out.println();	

//������� �Է��� ������ �� ���ϱ�

		Scanner s= new Scanner(System.in);
		int h=0; // ���ڵ��� ��
		int b;   // ���� 
		int num=0;  // �Է��� ���ڵ� 

		System.out.println("���� �Է��Ͻÿ� : ");
		num=s.nextInt();
		
		for(b=1; b<=num; b++) {
			h=num+b;
		}
		
		System.out.printf("1���� %d������ ���� %d",num,hap)


		
		Scanner ss= new Scanner(System.in);
		int hap=0;
		int i;
		int num1,num2,num3;
		
		System.out.println("���۰� �Է� : ");
		num1=ss.nextInt();
		
		System.out.println("���� �Է� : ");
		num2=ss.nextInt();
		
		System.out.println("������ �Է� : ");
		num3=ss.nextInt();
		
		for(i=num1; i<=num2; i=i+num3) {
			hap=hap+i;
		}
		
		System.out.printf("%d���� %d������ %d ������ ���� %d�Դϴ� \n",num1,num2,num3,hap);
		
		ss.close();
		
		
		
		//��ø for�� 
		
		int a,b;
		int c=0;
		
		for(a=0; a<3; a++) {
			for(b=0; b<2; b++) {
				System.out.printf("i��: %d, k��:%d, �ݺ�Ƚ��:%d \n",a,b,c=c+1);
				
			}	
		}
		
		    
	
System.out.println();
		
		// ������ 
		
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
			System.out.printf("���� ù ��° �� �Է� : \n");
			a=s.nextInt();
			
			System.out.printf("���� �� ��° �� �Է� : \n");
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
			
			System.out.println("----�� ���� ���� ����-----");
			System.out.println("���� �Ͻðڽ��ϱ�? (y/n)");
		
			c=s.next().charAt(0); //s.next() ==> ������ �Է¹޾Ƽ� ó�����ش� 
								// charAt(n) ==> �Է¹��� ���忡�� n+1��° ���ڸ� �����Ѵ� 
 			
			if(c=='y')
			
			System.out.printf("���� ù ��° �� �Է� : \n");
			a=s.nextInt();
			
			System.out.printf("���� �� ��° �� �Է� : \n");
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
		System.out.printf("[%d]�� �Դϴ�.\n",j);
		while(i<10) {
			System.out.printf("%d x %d = %d \n ",i,j,i*j);
			i++;
		}
		j++;
		i=1;
	}
	
	}
}

	

