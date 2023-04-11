import java.util.Scanner;


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
    sc.close();
}
    }
}
