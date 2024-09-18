import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Xenia {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        ArrayList <Integer> a= new ArrayList<Integer>();   //arraylist having all the numbers from the string.
        for(int i=0;i<st.length();i++){ 
            char ch=st.charAt(i);             
            if(ch!='+'){
                int c=Character.getNumericValue(ch);
            a.add(c);
            }
            }     
        Collections.sort(a);                              //sorting the list in increasing order
        for(int i=0;i<a.size();i++){                      //printing new String
            if(i!=a.size()-1)
            System.out.print(a.get(i)+"+");
            else System.out.print(a.get(i));
        }
        }
    } 

