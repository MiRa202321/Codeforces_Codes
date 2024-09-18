import java.util.Scanner;

public class Capital {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String st; int n=0;
        st=sc.next();
        // char ch=Character.toUpperCase(st.charAt(0));     
        // System.out.println(ch+st.substring(1));
        char ch= st.charAt(0);
        if(ch>='a'||ch<='z'){
         n=ch-32;
        System.out.println((char)n+st.substring(1));}
        else System.out.println(st);
    }
    
}
