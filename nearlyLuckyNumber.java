
import java.util.Scanner;

public class nearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();
        int luckycount=0;
        while(n>0)
        {
            int rem=(int)(n%10);
           if(rem==4||rem==7)
           {
            luckycount++;
           }
           n/=10;
          
        }
        
        if(luckycount==4 ||luckycount==7)
        {
            System.out.println("YES");
        }
        else
        {
             System.out.println("NO");
        }
    }
}
