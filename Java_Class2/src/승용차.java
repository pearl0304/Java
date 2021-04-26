class 승용차 extends car{

    승용차(){}

    int seat;

    public void checkseat(){

    }

    @Override
    public void speedUp(){
        System.out.println("승용차의 속도를 올립니다");
    }



}

class 세단 extends 승용차{

    String [] 편의기능목록 = new String[10];
}



class 트럭 extends car{

    public 트럭(){
    } //1. 서브클래스 생성자 호출 위치에서 skip
                        //4. 서브클래스 멤버들을 생성


    public 트럭(String s){
        super(s);// 써야할 경우 가장 먼저 작성
        System.out.println(s+"문자열을 출력하는 생성자 입니다 ");

    }

    int 적재량;

    public void 적재량재기(int value){
        적재량=적재량+value;
    }

    @Override
    public void speedDown(){
        System.out.println("트럭의 속도를 감속시킵니다");
    }


}


class 버스 extends car{

    String 경로;
    String 목적지;

    public void opendoor(){

    }

    public void closedoor(){

    }

}

class 시내버스 extends 버스{

}