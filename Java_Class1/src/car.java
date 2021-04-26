public class car {
    private String color;
    private int speed;


    /*
        SET은 변수값을 할당하는 목적의 함수이기 때문에 인자를 받아야 하고
        GET은 변수값을 반환하는 목적이기 때문에 return 이 필요합니다.*/

    String getColor(String 색){
        return color;
    }

    void setColor(String 색){
        this.color=색;
    }

    void setSpeed(int 속도){
        this.speed=속도;
    }

    int getSpeed(int 속도){
        return speed;
    }


    public void Upspeed(int value){
        speed=speed+value;
    }

    public void Downspeed(int value){
        speed=speed-value;
    }


}

