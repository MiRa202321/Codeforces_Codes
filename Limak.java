import java.util.Scanner;


public class Limak {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int years=0;
        while(a<=b){
            a=a*3;
            b=b*2;
            years++;
        }
        System.out.println(years);
    }
    
} 
