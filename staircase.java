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


public class staircase {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =1; i<= n;i++){
    for (int k = 1; k <=n-i; k++){
        System.out.print(" ");
    }
    for(int j=n-i; j<n;j++) {
        System.out.print("#");
    }
    System.out.println();
}
    }
}
