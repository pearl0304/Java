import java.io.IOException;
import java.util.Scanner;

public class ���ѷ��� {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
/*Scanner s = new Scanner(System.in);

int a=0, b=0;

while(true){
	
	try {
	
	System.out.printf("ù��° �� �Է� : ");
	a=s.nextInt();
	
	System.out.printf("�ι�° �� �Է� : ");
	b=s.nextInt();
	
	} catch(InputMismatchException e) {
		
		System.out.println("�Է� ���� ������ �ֽ��ϴ�");
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
				System.out.printf("ù��° �� �Է� : ");
				a=s.nextInt();
				
				System.out.printf("�ι�° �� �Է� : ");
				b=s.nextInt();
				
				System.out.printf("����� ������ : ");
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
			 System.out.printf("�����ڸ� �߸��Է����� \n");
				
			
			}
		
	}
 //�빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� System.in ���� 
		
		int n;
		char c;
		
		System.out.println("�빮�� �Է� : ");
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
			
			System.out.printf("�޴��� ������ �ּ��� : ");
			
			if(count==0) {
			System.out.print("\n1.īǪġ��   2.ī���   3. �Ƹ޸�ī��");
			} else {System.out.print("1.īǪġ��   2.ī���   3. �Ƹ޸�ī��  4.Stop");
			}
		
		n=s.nextInt();
		
		if(n==4 && count==0) {
			temp = n+1;}
		else {temp=n;}
			
		
		
		switch(temp) {
		case 1 : 
			System.out.printf("īǪġ�� ����");
			count++;
			break;
			
		case 2 : 
			System.out.printf("ī��� ����");
			count++;
			break;
		case 3 : 
			System.out.printf("�Ƹ޸�ī�� ����");
			count++;
			break;
			
		case 4 : 
			System.out.printf("�ֹ��Ͻ� Ŀ�ǰ� ���Խ��ϴ�");
			count++;
			break;
			
			default :
				System.out.printf("�߸��ֹ��ϼ̽��ϴ�");	
			}
		
		
		} while(n!=4 && count!=0);
		
		
		
		
		int hap =0;
		int i;
		
		for(i=1; i<=100; i++) {
			hap= hap+i;
			
			if(hap>=1000) break;
		}
		
		System.out.printf("1~100�� �տ��� ���ʷ� 1000�� �Ѵ� ��ġ�� : %d \n",i);
		
		
		int hap=0;
		int i;
		
		for(i=1; i<=100; i++) {
			if(i%3==0) 
				continue;
			hap = hap+i;
		}
			System.out.printf("1~100�� ��(3�� ��� ����): %d \n",hap);
			
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
			
		
			System.out.printf("������ �ݺ� %d \n",hap);
			
		}
		}
	
		
		
		
		
	}
}
		

		


		