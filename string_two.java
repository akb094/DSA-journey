import java.util.Scanner;
class Shashwat{
    public static void main(String[] args){
    String s1="i am a vitian";
    s1=s1.toLowerCase();
    String s2="i am an indian";
    s2=s2.toLowerCase();
    String s3=s1+s2;
    for(int i=97;i<122;i++){
        char w=(char)i;
        int f=0;
        for(int j=0;j<s3.length();j++){
            if(w==(s3.charAt(j))){
                f++;
            }

        }
        if(f>0){
            System.out.println(w+":"+f);
        }
    }
    
}
}