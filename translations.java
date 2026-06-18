import java.util.Scanner;
public class translations {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        String s2=sc.next();

       String rev= solve(s);

       if(s2.equals(rev))
       {
        System.out.println("YES");
       }
       else
       {
        System.out.println("NO");
       }

    }

    static String solve(String s)
    {
        int i=0;
        int j=s.length()-1;

        char ch[]=s.toCharArray();

        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;

            i++;
            j--;
        }

        return new String(ch);
    }
}
