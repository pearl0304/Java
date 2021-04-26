public class Mic {

    private int price;
    private int productcode;
    String color;
    String username;
    int power; //마이크꺼짐


    Mic() {}


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setProductcode(int code) {
        this.productcode = code;
    }

    public int getProductcode() {
        return productcode;
    }

    public void powerOn(int power){
        if(power ==1){
            System.out.println("마이크가 켜졌습다");
            System.out.println("리허설을 시작합니다");
        }else if(power==0) {
            System.out.println("마이크를 켜주세요");
        }else {
            System.out.println("값을 다시 입력해주세요");
        }
    }

}