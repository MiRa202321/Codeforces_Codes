import java.util.Scanner;

public class Vanya {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n,h;
  
    n=sc.nextInt();
    h=sc.nextInt();
    if(n<=1000&&n>=1&&h<=1000&&h>=1){
    int sum=0;
    int[] a= new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        if(a[i]<=2*h&&a[i]>=1){
        if(a[i]>h) sum=sum+2;
        else  sum=sum+1;
    }
}
    
 System.out.println(sum);
}
}
}
