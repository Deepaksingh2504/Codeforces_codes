//  theatre square

import java.util.Scanner;

public class theratreSquare {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long n=sc.nextInt();
         long m=sc.nextInt();
          long a=sc.nextInt();

            if(n==m)
            {
                long tile=(long)Math.ceil(((double)n/a));
                System.out.print(tile*tile);
            }
            else
            {
                long row=(long)Math.ceil(((double)n/a));
                long col=(long)Math.ceil(((double)m/a));

                System.out.println(row*col);
            }



    }
}
