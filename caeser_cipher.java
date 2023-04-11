import java.util.Scanner;
class caeser_cipher
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        String s=sc.next();
        int k=sc.nextInt();
        while(k>26)
        {
            k=k-26;
        }
        String s1="";
        int a=122-k;int b=90-k;
        for(int i=0;i<n;i++)
        {
            int q=s.charAt(i);
            if(q<123 && q>96)
            {
                if(q<=a)
                {
                    q=q+k;
                    s1=s1+(char)q;
                }
                else
                {
                    q=q-26+k;
                    s1=s1+(char)q;
                }
            }
            else if(q<91 && q>64)
            {
                if(q<=b)
                {
                    q=q+k;
                    s1=s1+(char)q;
                }
                else
                {
                    q=q-26+k;
                    s1=s1+(char)q;
                }
            }
            else
            {
                s1=s1+(char)q;
            }
        }
        System.out.println(s1);
        sc.close();
    }
}

