import java.util.Scanner;
class q2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String months[]=new String[]{"Jan" , "Feb" , "Mar" , "Apr" , "May" , "Jun" , "July" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"};
        String s=sc.nextLine();int p=0;int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                p=i+1;
                break;
            }
        }
        int yr=Integer.parseInt(s.substring(p+3));
        String mon=s.substring(0,p-1);
        int date=Integer.parseInt(s.substring(p,p+2));
        for(int i=0;i<months.length;i++){
            if(months[i]==mon){
                k=i;
                break;
            }
        }
        if(date<=23){
            date+=7;
        }
        else{
            date=date+7-30;
            mon=months[k+1];
        }
        System.out.print(mon+" ");
        System.out.print(date+" ");
        System.out.println(yr);
        sc.close();
    }
}