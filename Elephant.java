import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>0){
        if(n%5==0) System.out.println((int)(n/5));
        else System.out.println((int)(n/5)+1);
    }
}
    
}
