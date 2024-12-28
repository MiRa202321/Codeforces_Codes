import java.util.*;
public class Mathematician {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
// long a=sc.nextLong();
// long b=sc.nextLong();

// String s=Long.toString(a);
// String t=Long.toString(b);

String s=sc.nextLine();
String t=sc.nextLine();
// System.out.println(s);
// System.out.println(t);


String res="";
int l=s.length();
int i=0;
for(i=0;i<l;i++){
if(s.charAt(i)==t.charAt(i)){
    res=res+"0";
}
else res=res+"1";
}


System.out.println(res);
    }

}