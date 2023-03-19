import java.util.Scanner;
public class Solution3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        
        if(s.substring(0,2).equals("12"))
        {
            if(s.substring(8).equals("PM"))
            {
                System.out.println(s.substring(0,8));
            }
            else
            {
                System.out.println("00"+s.substring(2,8));
            }
        }
        else if(s.substring(8).equals("PM"))
        {
            int a=Integer.parseInt(s.substring(0,2));
            a=a+12;
            System.out.println(a+":"+s.substring(3,8));
        }
        else
        {
            System.out.println(s.substring(0,8));
        }
        sc.close();
    }
    
}
