
import java.util.*;

public class string_reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            s2=s.charAt(i)+s2;
        }
        if(s.equals(s2))
        System.out.println("Yes");
        else
        System.out.println("No");
        sc.close();
        
    }
}



