


import java.util.Scanner;

public class antonAndDanik {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        String s=sc.next();
        findOut(s,n);
    }
    

    static void findOut(String s,int n)
    {
        int count[]=new int[26];

        for(int i=0;i<n;i++)
        {
            count[s.charAt(i)-'A']++;
        }

        if(count['D'-'A']==count['A'-'A'])
        {
            System.out.println("Friendship");
        }
        else if(count['A'-'A']>count['D'-'A'])
        {
            System.out.println("Anton");
        }
        else 
        {
            System.out.println("Danik");
        }

        
    }
}

