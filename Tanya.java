import java.util.Scanner;

public class Tanya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k; 
        long n=0L;
        n=sc.nextLong();
        k=sc.nextInt();
        if(k<=50&&k>=1&&n<=1000000000&&n>=2){
        while(k>0){
            if(n%10==0){
                n=n/10;
                k--;
            } 
            else{
                n=n-1;
                k--;
            }

        }
     System.out.println(n);
    }
    
}
}
