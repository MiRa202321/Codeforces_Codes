import java.util.*;
public class Vasya
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc= new Scanner(System.in);
		
		  
		    String s;
		    s=sc.nextLine();
            int cp=0;
            int sm=0;
            if(s.length()>=1&&s.length()<=100){
                for(int i=0;i<s.length();i++){
                    char c=s.charAt(i);
                    if(c>='A'&&c<='Z') cp++;
                    else sm++;
                }
               // System.out.println(cp+" "+sm);
                    if(cp<=sm) System.out.println(s.toLowerCase());
                    else System.out.println(s.toUpperCase());
                }
            }
        }
    
