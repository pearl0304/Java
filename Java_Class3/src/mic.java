public class mic extends power{

    int voulm;

    @Override
    void turnOn(){
        voulm=voulm+10;
        System.out.printf("현재 마이크 볼륨 :  %d",voulm);

    }

    @Override
    void turnOff(){
        voulm=voulm-10;
        System.out.printf("현재 마이크 볼륨 :  %d",voulm);

    }

}
