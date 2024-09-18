import java.util.*;

public class Valera {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long[] a= new long[4]; 
        for(int i=0;i<4;i++){
           a[i]=sc.nextInt();        
        }
        Arrays.sort(a);
        int cnt=0;
        for(int j=0;j<3;j++){
            if(a[j]==a[j+1])
            {
                cnt++;
            }
            
            
        }
    

System.out.println(cnt);
}
}