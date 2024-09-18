import java.util.*;
public class Petya{    
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);
        String st1,st2; int result=0;
       // System.out.println("Enter  Strings");
        st1=sc.nextLine();
        st2=sc.nextLine();
        if(st1.length()<=100&&st1.length()>=0&&st2.length()<=100&&st2.length()>=0){
        result=st1.compareToIgnoreCase(st2);
        if(result<0)   System.out.println("-1");
        else if(result>0)   System.out.println("1");
        else    System.out.println("0");
    }
}}