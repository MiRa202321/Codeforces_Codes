import java.util.Scanner;

public class Ambitious{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
            int[] a= new int[n];
            int op=-1;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==0) op++;
            }
            if(op==1) System.out.println(op);
            else{

            int diff=Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
             
diff= Math.min(diff, Math.abs(a[i]));
            }
           System.out.println(diff);

        }


    }
    
}