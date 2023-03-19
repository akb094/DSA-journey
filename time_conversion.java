import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class time_conversion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
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
    }
    
}
