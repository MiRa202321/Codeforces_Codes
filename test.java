import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s;
        s=sc.next();
        int n=s.length();
        //int cnt=0;
       StringBuilder st=new StringBuilder();
        for(int i=0;i<n;i+=2){
            String pair=s.substring(i,i+2);
          //  if((s.substring(i,i+2))=="00") cnt++;
           //System.out.print((s.substring(i,i+2))+" ");
        //  //  for(int i=0;i<s.length()-1;i+=2){
        //     if((s.substring(i,i+2))=="00"){ st.append("A"); continue;}
        //       if((s.substring(i,i+2))=="01") {st.append("T"); continue;}//st=st+"T";
        //       if((s.substring(i,i+2))=="10"){st.append("C"); continue;}// st=st+"C";
        //        if((s.substring(i,i+2))=="11"){st.append("G"); continue;}// st=st+"G";
        
            if(pair=="00"){ st.append("A"); }
              if(pair=="01") {st.append("T");}//st=st+"T";
              if(pair=="10"){st.append("C"); }// st=st+"C";
               if(pair=="11"){st.append("G"); }// st=st+"G";  
    }
       // System.out.println(st);
    //
       System.out.println(st.toString());
        }
    }


