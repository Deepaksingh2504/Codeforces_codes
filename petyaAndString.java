// petyaAndString.java

import java.util.Scanner;
public class petyaAndStrings
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String s1=sc.next();
        String s2=sc.next();

        s1=s1.toLowerCase();
       s2= s2.toLowerCase();

        int i;
        for(i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
    
                continue;
            }
            else if(s1.charAt(i)<s2.charAt(i))
            {
                System.out.println(-1);
                break;
            }
            else if(s2.charAt(i)<s1.charAt(i))
            {
                System.out.println(1);
                break;
            }
        }

        if(i==s1.length())
        {
            System.out.println(0);
        }
     
    }
}
