public class just {
    public static void main(String[] args) {
        
    
 
       //String[] strs= {"flower","flow","flight"};
       String[] strs={"a","a","b"};
            String ls="";
            int max=0;
            int la;
            la=strs.length;
            String res="";
            // to find the longest string
            for(int i=0;i<la;i++){
                if(strs[i].length()>max){
                    max=strs[i].length();
                    ls=strs[i];
                }
            }

         //   System.out.println("larget string "+ls+" "+max);
            
            //comparing each string/its substring with the ls
            for(int j=0;j<la;j++){
                String st;
                int temp=0;
                st=strs[j];
                int l;
                l=strs[j].length();
    //             if(l>=max) {        not necessary if the length is same then the string will also be same
    //                 res=ls;
                   
    //             }
    //             else{
                if(st==ls) continue;
                    if(st.compareTo(ls.substring(0,l))==0) {
                        
                        res=st;
                        temp++;
                      System.out.println("first "+res);
                
                        
                }
                    else{
                        
                    while(l>0){
                
                        if(st.substring(0,l).compareTo(ls.substring(0,l))==0){
                            res=st.substring(0,l);
                         //   System.out.println("second "+res);
                            temp++;
                            break;
                        }
                       l--;
                        
            }
          
        }
    }//loop
           // System.out.println(res);
           //return res;
        }
    }
    

