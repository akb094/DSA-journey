import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    sc.close();
    String s="abcdefghijklmnopqrstuvwxyz";
    String l[]=new String[s.length()];int m[]=new int[s.length()];int n[]=new int[s.length()];
    for(int i=0;i<s.length();i++)
    {
        m[i]=0;
        n[i]=0;
    }
    for(int i=0;i<s.length();i++)
    {
        l[i]=s.substring(i,i+1);
    }
    for(int i=0;i<l.length;i++)
    {
        for(int j=0;j<s1.length();j++)
        {
            if(l[i].equalsIgnoreCase(s1.substring(j,j+1))){
            m[i]++;}
        }
        
    }   
    for(int i=0;i<l.length;i++)
    {
        for(int j=0;j<s2.length();j++)
        {
            if(l[i].equalsIgnoreCase(s2.substring(j,j+1))){
            n[i]++;}
        }
        
    }   
    int k=0;
    for(int i=0;i<s.length();i++)
    {
        if(m[i]!=n[i]){
        System.out.println("Not Anagrams");
        break;}
        else{
            k++;
        }
    }
    if(k==(s.length()) && m[s.length()-1]==n[s.length()-1])
    System.out.println("Anagrams");
 }
    
}