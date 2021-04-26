public class Q2 {

    public static void main(String args[]){

        Mic JKmic = new Mic();

        JKmic.color = "보라색";
        JKmic.username = "BTS 정국";
        JKmic.setPrice(1000000);
        JKmic.setProductcode(19970901);

        System.out.println(JKmic.color + "마이크는 " + JKmic.username + "이 사용합니다");
        System.out.println();
        System.out.print(JKmic.username+"의 마이크 가격은" +JKmic.getPrice()+"원이며 \n"  +"제품코드는"+JKmic.getProductcode()+"입니다");
        System.out.println();
        System.out.println();
        System.out.println("===리허설을 준비합니다===");
        System.out.println();
        JKmic.powerOn(0);
        System.out.println();
        JKmic.powerOn(1);
        System.out.println();
        JKmic.powerOn(2);



        // 제목 : 수행평가 실기 문제
        // 파일명 : 이름.java


    }
}
