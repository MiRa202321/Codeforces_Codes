import java.util.*;
public class Doremy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) 
        {
            int n=sc.nextInt();
            int[] a= new int[n];
            
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            Map<Integer, Integer> map= new HashMap<>();
            

            for(int x: a){
                if(map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                }

                else{
                    map.put(x,1);
                }
            }

            if(map.size()==1) System.out.println("Yes");

            else if(map.size()>=3) System.out.println("No");
            else{

                int f1=0, f2=0;
                int[] keys= new int[2];
                int pos=0;

                for(Map.Entry<Integer,Integer> m: map.entrySet()){

                 keys[pos]= m.getKey();
                 if(pos==0) f1= m.getValue();
                 else f2=m.getValue();
                 pos++;
            }

            if(f1==f2) System.out.println("Yes");

            else if(n%2!=0 && n>1 && Math.abs(f1-f2)==1) System.out.println("Yes");

            else System.out.println("No");


             
             }

        }
    }
    
}
