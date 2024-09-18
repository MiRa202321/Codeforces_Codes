import java.util.Scanner;

public class Soldiers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k,w;
        long n;
        k=sc.nextInt();
        n=sc.nextLong();
        w=sc.nextInt();
        long left=0;
        int tot_cost=0;

        tot_cost=((w*(w+1))/2)*k;
        left=tot_cost-n;
      long b= (n>tot_cost)?0:left;
        System.out.println(b);
    }
    
}
