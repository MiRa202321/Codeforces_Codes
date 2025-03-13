import java.util.*;
public class DrawSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int[] a= new int[4];
            for(int i=0;i<4;i++){
                a[i]=sc.nextInt();
            }
            int cnt=0;

            for(int i=0;i<3;i++){
                if(a[i]!=a[i+1]){
                    break;
                }
            else cnt++;
            }
            if(cnt==3) System.out.println("Yes");
              else  System.out.println("No");
        }

    }
    
}
