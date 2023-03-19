import java.io.*;
import java.util.*;
import java.util.regex.*;

public class pattern_syntax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        for(int i = num; i > 0; i--){
            String pat = scan.nextLine();
            try{
                Pattern reg = Pattern.compile(pat);
                System.out.println("Valid");
            }
            catch(Exception e){
                System.out.println("Invalid");
            }
        }
        scan.close();
    }
}

