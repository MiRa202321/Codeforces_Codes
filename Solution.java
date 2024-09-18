// import java.util.ArrayList;
// import java.util.Scanner;

// public class Hero {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         String st=sc.next();
//         int cnt=0,temp=0;
        
//         ArrayList<Character> a= new ArrayList<>();
//        for(int i=0;i<st.length();i++){
//         for(int j=0;j<i;j++){
//             if(st.charAt(i)==st.charAt(j))
//             break;
//         }
//             if(i==j)
//            a.add(st.charAt(i));
//         }
       
        
//         System.out.println(a.size());
//         if(a.size()%2==0) System.out.println("CHAT WITH HER!");
//         else System.out.println("IGNORE HIM!");
//     }
// }

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input string
        String username = sc.nextLine();
        
        // Use a HashSet to count distinct characters
        HashSet<Character> distinctChars = new HashSet<>();
        
        // Iterate over the characters in the username
        for (char c : username.toCharArray()) {
            distinctChars.add(c);
        }
        
        // Check the size of the set and print the appropriate message
        if (distinctChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        
       // sc.close();
    }
}
