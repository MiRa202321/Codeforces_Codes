import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a= new int[n];
        int[] b= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    
        for(int j=0;j<n;j++){
            b[j]=sc.nextInt();
        }
        int temp=0;
        for(int k=0;k<n;k++){
           if(a[k]==n||b[k]==n){ 
            System.out.println("I become the guy");
           temp=1;
           break;
           }
        }
        if(temp==0) System.out.println("Oh, my keyboard!");
    }
    
}
