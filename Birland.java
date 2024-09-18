import java.util.Scanner;

public class Birland {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        String t;
        s=sc.next();
        t=sc.next();
        int l=s.length();
        int m=t.length();
           if(s.length()==t.length())
{        
            int i,ft,lt;
        
           ft=0;lt=l-1;
           int temp=0;
           while(lt>=0||ft<l){
                if(s.charAt(ft)!=t.charAt(lt )){
                    System.out.println("NO");
                temp=1;
                    break;
                }
                else{
                    lt--;
                    ft++;
                }
            }
        
            if(temp==0)
                System.out.println("YES");
            
        }
        else{
            System.out.println("NO");
        }
    }
    
}

