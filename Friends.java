import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n<=100000&&n>=1){
        String st=sc.next();
        int a=0;
        int d=0;
        for(int i=0;i<n;i++){
              if(st.charAt(i)=='A') a++;
              else if(st.charAt(i)=='D')d++;

        }
        if(a>d) System.out.println("Anton");
        else if(a<d) System.out.println("Danik");
        else if(a==d)System.out.println("Friendship");

    }
}
}
