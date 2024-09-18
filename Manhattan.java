import java.util.Scanner;

public class Manhattan{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t;
        t=sc.nextInt();
        
        if(t<=1000&&t>=1){
        while(t-->0){
            int n,m;
            int i,j;
            n=sc.nextInt();
            m=sc.nextInt();
            char[][] a=new char[n+1][m+1];
            for( i=1;i<=n;i++){
              for( j=1;j<=m;j++){
                a[i][j]=sc.next().charAt(0);
              }
            }//input
         
           outer: for( i=1;i<=n;i++){
int r=0;
int c=0;
                for( j=1;i<=m;j++){
                    if(a[i][j]=='#'){
                        if(a[i+1][j]=='.'&&a[i-1][j]=='.'&&a[i][j+1]=='.'&&a[i][j-1]=='.'&&i<n&&j<m){

                       System.out.println(i+" "+j);
                       break outer;
                    }
                 else
                 if(a[i+1][j]=='#'&&a[i-1][j]=='#'&&i<n) r++;
                 else
                 if(a[i][j+1]=='#'&&a[i][j-1]=='#'&&j<m) c++;
        }
      //  if(r==c) System.out.println(i+ " "+j);
    }
}
}
        }
    }
}
