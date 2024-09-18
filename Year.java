import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt(); 
       
        if(n>=1000){
        for(int i=n+1;i<=9012;i++){
        
        
            
          boolean b=distinctChar(i);
        
          if(b==true){
            System.out.println(i);
             break;           
        }
     
      }
    }
    }
   public static boolean distinctChar(int n){
    String st=Integer.toString(n);
    int l=st.length();
    int i,j;
     for(i=0;i<l-1;i++){
      for( j=i+1;j<l;j++){
        if(st.charAt(i)==st.charAt(j)){
    
      return false;
        }
    }
  }
    return true;
    }
  }
    

