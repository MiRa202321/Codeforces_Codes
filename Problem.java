import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class Problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n<=100&& n>=1){
        int[] a= new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
                 a[i]=sc.nextInt();
                 if(a[i]==1){
                    System.out.println("HARD");
                    temp=1;
                   break;              
                 }
        }
        if(temp==0) System.out.println("EASY");
    }
}
}
