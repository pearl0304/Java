import java.util.Scanner;

public class semitest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 /* ����� ) 12 true AB 12 12 Java error 
		
		System.out.println("1"+"2"); //����
		System.out.println("true"+""); //����
		System.out.println('A'+'B'); //����
		System.out.println('1'+2); //����
		System.out.println('1'+'2'); //����
		System.out.println('J'+"ava"); //���� 
		//System.out.println(true+null); 
		
		System.out.println("A"+"B");
		
		System.out.println((int)'A'); //65 (���������� ���� ó��=�ڵ尪) �ڹ��ڴ� �ڵ尪(����)���� ó����
		System.out.println((int)'B'); //66 
		System.out.println((int)'1'); //49
		System.out.println((int)'2'); //50 
		
		//����� ��µ� �ʿ��� �ٱ����� ���� ���ϴ� ���α׷��� ����ÿ�
		//����� ���� �Է¹ޱ� , �ٱ��ϴ� �ִ� ���� �� �ִ� ����� ���� , �ٱ��� ���� ��� 
		
		
	 Scanner s = new Scanner(System.in);
	 int max;
	 int apple;
	 
	 System.out.printf("�ִ� �ٱ��� �� : ");
	 max = s.nextInt();
	 
	 System.out.printf("����� ������ �Է��Ͻÿ� : ");
	 apple = s.nextInt();
	 
	 if((apple % max) == 0 ){
	 System.out.printf("%d��\n",apple/max);}
	 else{
	 System.out.printf("%d��\n",(apple/max)+1);
	 } 
		
	// �Է��� ���� ���� ���� ���� '���' '����' '0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �Ǽ����� �Է��� ��� ���������� �ý����� ����� �� �ֵ��� /

		
		int a;
		Scanner s = new Scanner (System.in);
		System.out.printf("������ �Է��Ͻÿ� : ");
		
		try {
			
			a=s.nextInt();
			
		if(a>=0) {
			if(a>0) {
			System.out.printf("%d�� ����Դϴ�.",a);}
			else {System.out.printf("%d�� 0�Դϴ�.",a);}
			}
		else{
			System.out.printf("%d�� �����Դϴ�.",a);	
		}
		} catch(Exception e) {
			System.out.printf("�߸� �Է��ϼ̽��ϴ�");
			
			s.next(); //s�� �����Ͽ� ���� ���� �޵��� ��. ���࿡ ������ ���� ������ �ɸ� �� ����.
		}

		
		// ����� Ȱ���Ͽ� �������� 2x+4y=10�� ��� ���� �ظ� ���Ͻÿ� 
		
		System.out.println("2x +4y =10�� ���� �� ���ϱ�");
		
		int x;
		int y;
		
		for(x=0;x<=10;x++) {
			for(y=0;y<=10;y++) {
			if((2*x)+(4*y)==10) // <- ���� ������ �� 
				System.out.printf("x= %d, y=%d \n", x,y);}
		}*/
		
		//0���� 100������ ���� �����ϰ� �����ϰ� ������ �� ���߸� ����Ǵ� �̴� ������ �����Ͻÿ�
		//(int)(Math.random()*100
		
		
		int a=0;
		int b=0;
		int count=0;
		
		a = (int)(Math.random()*100);
		Scanner s = new Scanner(System.in);
		

		while(true){
			System.out.printf("0~100 ������ ������ �Է��Ͻÿ� : ");
			b=s.nextInt();
			count++;
			
			if(b<a) {
			System.out.println("�Է��� �������� �۽��ϴ�.");
			}
			else if(b>a) {
				System.out.println("�Է��� �������� Ů�ϴ�.");
			}
			
			else {System.out.println("�Է��� ���� �½��ϴ�.");
				System.out.printf("�� %dȸ���� ������ϴ�.",count);
				break;} //while �� �ȿ��� break; 
			
		} 
	
		
		//����� ��µ� �ʿ��� �ٱ����� ���� ���ϴ� ���α׷��� ����ÿ�
		//����� ���� �Է¹ޱ� , �ٱ��ϴ� �ִ� ���� �� �ִ� ����� ���� , �ٱ��� ���� ��� 
		
		
		int aa;
		int bb;
		Scanner ss = new Scanner(System.in);
		aa=(int)
		
		System.out.printf("����� ���� �Է��ϼ��� : ");
		
				
			}
		}
		
		


	

