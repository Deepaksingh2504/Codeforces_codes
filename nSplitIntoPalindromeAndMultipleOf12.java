// n split into palindrome and multiple of 12 

import java.util.Scanner;
public class nSplittoPalindromeAndMulOf12 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int t=sc.nextInt();

            while(t>0)
            {
                long n=sc.nextLong();

                if(n<12)
                {
                System.out.print(-1);
                t--;
                continue;
                }
                else
                {
                    boolean found=false;
                    long i=12;
                    while(i<n)
                    {
                        long number=n-i;
                       boolean res= checkPalindrome(number);    

                       if(res==true)
                       {
                        found=true;
                        System.out.println(number+" "+i);
                        break;
                       }
                    
                    i+=12;
                    }
                     if(found==false)
                    {
                        System.out.println(-1);
                    }
                }
                t--;
                    
                }
                
            
            }


    static boolean checkPalindrome(long num)
    {
        long rev=0;
        long store=num;

        while(store>0)
        {
            long rem=store%10;
            rev=rev*10+rem;
            store/=10;
        }
        if(rev==num)
        {
            return true;
        }

        return false;
    }

}
