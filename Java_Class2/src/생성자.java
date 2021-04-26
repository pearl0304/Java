public class 생성자 {

    public static void main(String args[]){ //static은 클래스꺼

        coffee 커피 = new coffee();//컴파일러가 생성자가 하나라도 없으면 자동으로 생성해준다
        //클래스 이름 확인 -> 클래스 이름이 생성자와 동일한 이름이 있는지 확인

        커피.set원산지("과테말라");


        커피.set가격(4600);
        System.out.print(커피.get가격());

        coffee aa[]= new coffee[100];
        for(int i=0 ; i<aa.length;i++){
            aa[i] = new coffee("과테말라","안티구아");
        }


        int bb[] = new int [100];

        coffee.커피수량();
        coffee.판매량 =10;


        승용차 a = new 승용차();






        트럭 b = new 트럭();
        트럭 c=  new 트럭("하이");






    }
}
