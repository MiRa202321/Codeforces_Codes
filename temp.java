import java.util.*;
public class temp
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a temp in C");
        float tempc = sc.nextFloat();
        float tempf= (tempc* 9/5)+32;
System.out.println(tempf);
    }
}