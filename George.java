import java.util.Scanner;

public class George {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n<=100&&n>=1){
        int cap=0;
        int cnt=0;
        while(n-->0){
      
            int p,q;
            p=sc.nextInt();
            q=sc.nextInt();
            if(p>=0&&p<=100&&q<=100&&q>=0){
            if(q-p>=2) cap++;
            }
            else cnt++;
        }
        if(cnt==0) System.out.println(cap);
    }
}
}
