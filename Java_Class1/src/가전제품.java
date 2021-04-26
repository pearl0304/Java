public class 가전제품 {

    int 가격;
    int 크기;
    String 제조사 ;
    String 브랜드;
    String 종류;
    String 색상;
    boolean 전원;




    public void turnON(){
        전원=true;
    }

    public void turnOff(){
        전원=false;
    }

    public void 메뉴실행(){
        if(전원){
            System.out.println("메뉴를 실행합니다");
        }else{
            System.out.println("전원이 꺼져있습니다. 전원부터 켜주세요");
        }

    }
    


}




