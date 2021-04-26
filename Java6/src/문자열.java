import java.util.Scanner;

public class 문자열 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 메소드 1. 입력이 있을 수 있음 / 2. 기능 수행 후 종료 or 반환 값
        String str = "IT CookBook Java";
        int len;

        len=str.length();

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열의 길이 : %s \n", len);


        Scanner s = new Scanner(System.in);
        String st;

        System.out.printf("문자열 입력 : ");
        st = s.nextLine(); // enter 기준으로 문자를 받음. <> .next()는 spacebar 기준 으로 문자를 받음

                            // 사용자가 입력한 문장을 반환  // 반환 여부는 메소드에서 확인 가능
        System.out.printf("출력 문자열 : ");
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'o') {
                System.out.printf("%c", '$');
            } else {
                System.out.printf("%c", st.charAt(i));
            }
        }

        Scanner s1 = new Scanner(System.in);
        String str1;

        System.out.printf("문자열 입력 : ");
        str1 = s1.nextLine();

        System.out.printf("출력문자 입력 : ");

        if(!str1.startsWith("("));  // 문자열의 시작이 (가 아니면 (을 출력한다
        System.out.printf("(");

        for(int i=0; i<str1.length();i++)        // 입력한 문자를 모두 출력한다
        System.out.printf("%c",str1.charAt(i));

        if(!str1.endsWith(")"));     // 문자열의 끝이 (가 아니면 (을 출력한다
        System.out.printf(")");


        Scanner s2= new Scanner(System.in);
        String str2, strRep, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str2 = s2.nextLine();

        strRep = str2.replace(" ","$");
        strSub = str2.substring(3,8);
        strAry = str2.split(" ");

        System.out.println("입력문자 입력 : " + str2);
        System.out.println("바꿀문자 입력 :" + strRep);
        System.out.println("일부 문자 :" + strSub );
        for(int i=0; i<strAry.length;i++)
        System.out.println("분리한 문자열" + i + "==>" + strAry[i]);


        String str3 = " a b c d e ";
        System.out.println(str3.toUpperCase());

        str3 = str3.toUpperCase();

        System.out.println(str3.toLowerCase());

        System.out.println(str3.replace(" ",""));

    }
}