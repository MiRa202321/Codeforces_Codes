import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long N ;
        N=sc.nextLong();
       
        long sum=0;
if(N%2==0) sum=N/2;
else sum=(-1)*((N/2)+1);


System.out.println(sum);
}   
}
