import java.util.Scanner;
class hack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        hack obj=new hack();
        for(int k=0;k<n;k++)
        {
            String s=sc.nextLine();
            obj.compute(s);
        }
        sc.close();
    } 
        
        void compute(String a)
        {
        String s1="";String s2="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='h' || a.charAt(i)=='a' || a.charAt(i)=='c' || a.charAt(i)=='k' || a.charAt(i)=='e' || a.charAt(i)=='r' || a.charAt(i)=='n')
            {
                s1=s1+a.charAt(i);
            }
        }
        for(int i=0;i<s1.length();i++)
        {
            int f=0;
            for(int j=0;j<=i;j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                f++;
            }
            if(s1.charAt(i)=='h' || s1.charAt(i)=='e' || s1.charAt(i)=='c' || s1.charAt(i)=='n')
            {
                if(f==1)
                s2=s2+s1.charAt(i);
            }
            if(s1.charAt(i)=='a' || s1.charAt(i)=='k' || s1.charAt(i)=='r')
            {
                if(f==2)
                s2=s2+s1.charAt(i);
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        if(s2.equals("hackerrank"))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        }
    }