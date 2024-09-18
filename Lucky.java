import java.util.Scanner;

public class Lucky{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long d=0;
        long n=0L;
        n=sc.nextLong();
        
        int cnt=0;
        while(n>0){
            d=n%10;
            if(d==4||d==7) cnt++;
            n=n/10;
        }
        if(cnt==4||cnt==7) System.out.println("YES");
        else System.out.println("NO");
    }
}
