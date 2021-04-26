import java.io.*;
import java.util.Scanner;

//carriage return 13 / line feed 10
public class 표준입출력 {

    public static void main(String args[]) throws Exception {

      String path = 표준입출력.class.getResource("").getPath();
        System.out.println(path); // 절대경로가 출력됨



        try {
            FileInputStream fis = new FileInputStream("C:/Temp/data1.txt");
                //fis = 뒤에 선언한 경로 안의 파일 정보가 들어있음

            int ch;

            while ((ch = fis.read()) != -1)  //-1 EOF end of file
                System.out.print((char) ch);

            fis.close();


        } // try
        catch (Exception e){
            System.out.println("잘못입력했습니다");
        }



        try {
            FileInputStream fis = new FileInputStream("C:/Temp/data1.txt");
            //fis = 뒤에 선언한 경로 안의 파일 정보가 들어있음

            int ch;
            byte[] bt = new byte[1024];

            int i = 0;

            while ((ch = fis.read()) != -1) {
                bt[i] = (byte) ch;
                i++;
            }
            //-1 EOF end of file
            System.out.print(new String(bt));  //byte 형식의 배열을 string 형식으로 출력한다
                                              //byte는 255자가 넘어가면 아스키코드가 아닌 유니코드를 조합하여 출력

            fis.close();


        } // try
        catch (Exception e) {
            System.out.println("잘못입력했습니다");

        }

        try {

            FileReader fReader = new FileReader("C:/Temp/data2.txt");  //일단 원본 파일을 읽어오기
            BufferedReader bReader = new BufferedReader(fReader); // 파일안에 있는 유니코드 2byte로 읽어오기

            String str = null; //문장의 내용이 없을 때까지


            while ((str = bReader.readLine()) !=null) {
                System.out.println(str);
            }
            bReader.close();
            fReader.close();

        } catch (Exception e){}


            Scanner sc = new Scanner(new File("C:/Temp/data3.txt"));

            int hap=0;

            while (sc.hasNextLine()) {
                hap = hap + sc.nextInt();
            }
                System.out.println("합계 : " + hap);
                sc.close();


        FileOutputStream fos = new FileOutputStream("C:/Temp/data4.txt");

        int ch;

        while ((ch=System.in.read())!=10)
            fos.write((byte) ch);

        fos.close();


        Scanner s = new Scanner(System.in);
        FileWriter fw = new FileWriter("C:/Temp/data6.txt");
        String str;

        while (!(str=s.nextLine()).equals(""))
            fw.write(str+"\r\n");

        fw.close();

         FileReader fr = new FileReader("C:/Temp/data6.txt");
         BufferedReader br = new BufferedReader(fr);

         String a= null;

         while ((a=br.readLine())!=null){
             System.out.println(a);

        } fr.close();
         br.close();

    }
}
