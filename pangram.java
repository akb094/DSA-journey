import java.util.Scanner;
class pangram
{    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String s1="abcdefghijklmnopqrstuvwxyz";
        String s2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        sc.close();
        for(int i=0;i<s1.length();i++)
        {
            int f=0;int k=0;
            for(int j=0;j<s.length();j++)
            {
                if(s1.charAt(i)==s.charAt(j) || s2.charAt(i)==s.charAt(j) || s.charAt(j)==' ')
                f++;k++;
            }
            if(f==0){
            System.out.println("not pangram");
            break;
            }
            if(k==s1.length() && s1.charAt(s1.length()-1)=='z' && s2.charAt(s1.length()-1)=='Z'){
            System.out.println("pangram");
            }
            
        }
        System.out.println("Thank you");
    }
}
