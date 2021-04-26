public class 자동차 {

    private int 가격;
    int 연식;
    double 연비;
    String 색상;
    String 제조사;
    String 차종;
    String 브랜드명;
    int 속도;





    public void 가속() {
        속도 = 속도 + 10;
    }

    public void 가속(int value) {
        속도 = 속도+value;
    }
    public void 감속() {
        if (속도 <= 0) {
            속도 = 0;
        } else {
            속도 = 속도 - 10;
        }

    }
    public void navOn(){

    }
}


