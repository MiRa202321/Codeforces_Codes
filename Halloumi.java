import java.util.Scanner;

public class Halloumi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){

        int n=sc.nextInt();
        int k=sc.nextInt();
      
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        if(isSorted(a)) System.out.println("YES");
        else{
            if(k==1) System.out.println("No");

            else {
                System.out.println("YES");
            }
        }
    }
}
    public static boolean isSorted(int[] a){

        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]) {
        
                return false;
            }
        }
        return true;
    }
    
}
