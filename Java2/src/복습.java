import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int a = 99;
		
		if (a<100)
			System.out.println("100���� �۴� \n");
		

System.out.println();

		int b = 200;
		if (b<100)
			System.out.println("100���� �۴� \n");
			System.out.println("�� ������ �� ���ϲ� \n");
			System.out.println("���α׷� ���� \n");

System.out.println();
			
		int c =200;
		if (c<100) {
			System.out.println("100���� �۴� \n");
			System.out.println("�� ������ �� ���δ�");
		}
		System.out.println("���α׷� ��");
		
System.out.println();		
		int d = 200;
		if (d<100)
			System.out.println("100���� �۴� \n");
		else 
			System.out.println("100���� ũ��");
		
System.out.println();		
		
		int e = 200;
		
		if (e<100) {
			System.out.println("100���� �۴� \n");
			System.out.println("���̸� �� ���嵵 ���δ�");
		}
		else {
			System.out.println("100���� ũ�� \n");
			System.out.println("�����̸� �� ������ ���δ� \n");
		}
System.out.println();

			Scanner s= new Scanner(System.in);
			int f;
			
			System.out.println("������ �Է��ϼ��� : ");
			f=s.nextInt();
			
			if (f%2==0)
				System.out.println("¦��");
			else 
				System.out.println("Ȧ��");
System.out.println();
			
		Scanner ss= new Scanner(System.in);
		int g;
		
		System.out.println("������ �Է��ϼ��� : ");
		g=ss.nextInt();
		
		if(g>=50) {
			if(a<100)
				System.out.println("50�̻� 100�̸��̴�");
			else
				System.out.println("100�̻��̴�");
		}
		
		else 
			System.out.println("50���� �۴�");
System.out.println();		

		Scanner sss= new Scanner(System.in);
		int h;
		
		System.out.println("������ �Է��Ͻÿ� : ");
		h=sss.nextInt();
		
		if (h>=90) {System.out.println("A����");}
			else if (h>=80) System.out.println("B����");
			else if (h>=70) System.out.println("C����");
			else if (h>=60) System.out.println("D����");
			
		else 
			System.out.println("F����");

		System.out.println();			
		Scanner r= new Scanner(System.in);
		int i;
		
		System.out.println("1~4 �߿��� �����ϼ��� : ");
		i=r.nextInt();
		
		switch(i) {
		case 1 :
			System.out.println("1����");
			break;
		case 2 :
			System.out.println("2����");
			break;
		case 3 :
			System.out.println("3����");
			break;
		case 4 :
			System.out.println("4����");
			break;	
			
		default : 
			System.out.println("�߸��� ����");
		
		}
	
		
		//���� �հ� ���ϱ� 

Scanner s= new Scanner(System.in);
int h=0;
int i;
int n;

System.out.printf("���� �Է��Ͻÿ� : ");
n=s.nextInt();

for(i=1; i<=n; i++) {
	h=h+i;
}

System.out.printf("1���� %d������ ���� %d",n,h);

*/

		// ���� 3���� ��  
		Scanner s = new Scanner(System.in);
		int h=0;
		int n1,n2,n3;
		int i;
		
		System.out.printf("ù��° �����Է� : \n");
		n1=s.nextInt();
		
		System.out.printf("�ι�° �����Է� : \n");
		n2=s.nextInt();
		
		System.out.printf("����° �����Է� : \n");
		n3=s.nextInt();
	
		for(i=n1; i<=n2; i=i+n3) {
			h=h+i;
			
		}
		System.out.printf("%d���� %d���� %d�� ������ ���� ���� %d",n1,n2,n3,h);



	}
}