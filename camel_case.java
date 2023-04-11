import java.util.Scanner;


public class camel_case {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();int f=1;
        for(int i=0;i<s.length();i++)
        {
            char w=s.charAt(i);
            if(Character.isUpperCase(w)==true)
            {
                f++;
            }
        }
        System.out.println(f);
        sc.close();
    }
    
}
