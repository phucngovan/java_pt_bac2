import java.util.Scanner;

public class pt_bac2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double a,b,c,x1,x2;
        System.out.println("nhập vào giá trị của a");
        a=sc.nextDouble();
        System.out.println("nhập vào giá trị của b");
        b=sc.nextDouble();
        System.out.println("nhập vào giá trị của c");
        c=sc.nextDouble();
        if(a==0) {
          if(b==0) {
              System.out.println("phương trình k hợp lệ");
          }else {
               x1=-c/b;
              System.out.println("phương trình có nghiệm là " + x1);
          }

        }else {
            double denta=Math.pow(b,2)-4*a*c;
            if(denta>0){
            x1=(-b+Math.sqrt(denta))/2*a;
            x2=(-b-Math.sqrt(denta))/2*a;

            System.out.println("phương trinh có 2 nghiệm: " + "x1 =" +x1 + " "+ "x2=" + x2);
        }else {
                System.out.println("phương trình vô nghiệm ");
            }
    }
}
}
