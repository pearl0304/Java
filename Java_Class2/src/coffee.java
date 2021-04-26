public class coffee {

    private int 가격; // 인스턴스변수
    private String 원산지; //인스턴스변수
    private String 종류;//인스턴스변수
    static int 판매량; //클래스변수 -> 직접 접근 안됨

    public coffee(){};




    public coffee(String s){
        원산지=s;

    }

    public coffee (String s,String ss){
    원산지 = s;
    종류 = ss;
    }
    
     static void 커피수량(){  //static 인스턴스 없이 사용 가능
        System.out.println("아직 재고 파악이 안되었음");
     }

    public void set가격(int a){
        this.가격=a;
    }

    public int get가격(){
        return 가격;
    }


    public void set원산지(String s){
        this.원산지=s;
    }

    public String get원산지(){
        return 원산지;
    }

    public void set종류(String s){
        this.원산지=s;
    }

    public String get종류(){
        return 종류;
    }

    public void 추출(){

    }

    public void 볶는다(){

    }

}
