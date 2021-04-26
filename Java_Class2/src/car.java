public class car {


    public car(String s){
        System.out.println("나는" + s+"서브클래스를 호출한 생성자");
    }

    public car(){} // 2. 슈퍼클래스의 생성자를 호출
                    //3. 슈퍼클래스가 가지고 있는 멤버 정보를 통해 인스턴스에 추가


    int 가격;
    private String 브랜드;
    String 제조사;
    String color;
    int speed;


    public void set브랜드(String a){
        this.브랜드=a;
    }

    public String get브랜드(){
        return 브랜드;
    }


    public car(int a,String b){
        가격=a; 브랜드=b;
    }

    public void speedUp(){

    }

    public void speedDown(){
        System.out.println("자동차 감속");

    }
}
