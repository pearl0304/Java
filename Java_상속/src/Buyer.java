import java.util.Scanner;

public class Buyer {

    int 장바구니공간=0;
    int 예산 =1000;
    Product cart[] = new Product[3]; //product 타입의 배열 선언 / new = 배열을 만들기 위한 초기화

    public void buy(Product p){  //product 타입을 받는다
        if(예산 < p.price){
            System.out.print("잔액이 부족합니다"); return;
        } else {
            예산=예산- p.price;
        } add(p);
    }

    public void add(Product p){
        if(장바구니공간>= cart.length) {
            System.out.println("장바구니 크가거 부족하여 큰 바구니로 교체합니다");
            Product 추가공간[] = new Product[cart.length * 2];
            System.arraycopy(cart,0,추가공간,0,cart.length); //* 복사해서 배열에 넣어줌

            //cart[0] cart[1] cart[2]
            //추가공간[0] 추가공간[1] 추가공간[2] 추가공간[3] 추가공간[4] 추가공간[5]
            // cart0~2=추가공간 0~2

            cart=추가공간;
        }
        cart[장바구니공간++]=p;  //
    }




    public void summary(){

        String itemList ="";
        int sum = 0;
        for(int i = 0 ; i< cart.length ; i++){
            if(cart[i]==null) break;
        }



    }
}
