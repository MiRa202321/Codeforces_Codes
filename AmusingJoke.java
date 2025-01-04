import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String guest=sc.nextLine();
        String host=sc.nextLine();
        String pile=sc.nextLine();

        if((guest.length()+host.length()) != pile.length()){
            System.out.println("NO");
        }
else{

String st=guest+host;

char[] a= st.toCharArray();
char[] b= pile.toCharArray();
int temp=0;
Arrays.sort(a);
Arrays.sort(b);

for(int i=0;i<st.length();i++){
    if(a[i]!=b[i]){
        System.out.println("NO");
         temp=1;
        break;
    }
}

if(temp==0) System.out.println("YES");

}

    }
}
