public class Object {
    public static void main(String args[]){

        BTS RM = new BTS();


//        RM.get나이(28);
        RM.이름="김남준";
        RM.포지션="리더";
        RM.특징="똑똑한 골든리트리버";

//        System.out.printf("RM의 나이는 %d세 \n",RM.get나이(28));
        System.out.printf("RM의 이름은 %s \n",RM.이름);
        System.out.printf("RM의 포지션은 %s \n",RM.포지션);
        System.out.printf("RM의 특징은 %s \n",RM.특징);

        RM.cute(940912);
        System.out.printf("RM의 귀여움의 정도는 %d \n",RM.귀여움);

    }
}
