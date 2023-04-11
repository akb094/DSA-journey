import java.util.Scanner;



public class diagonal_difference{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum1=0;int sum2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum1+=arr[i][i];
                }
            }
        }
        int k=n-1;
        for(int i=0;i<n;i++)
        {
            sum2+=arr[i][k];
            k--;
        }
        if((sum1-sum2)>0)
        {
         System.out.println(sum1-sum2);
        }
        else
        {
            System.out.println(sum2-sum1);
        }
        sc.close();
    }
    
}
