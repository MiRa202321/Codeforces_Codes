// // destination type shpuld be greater than the input
// // automatic conversion of datatypes
// typecasting:
// narrowing cnversion: float to int
public class typecasting{
    public static void main(String[] args) {
        int num = (int)(67.56);
        System.out.println(num);
        // int a=257;
        // byte b=(byte)(a); //257%256=1
        // System.out.println(b);  byte max value= 256

        // byte a=40,b=50,c=100;  //java automatically promoting the sub values in int to perform func;
        // int d=a*b/c;
        // System.out.println(d);
  // unicode: hello in diff lang. 

byte b=42;
char c='a';
short s= 1024;
int i=54100;
float f=5.64f;
double d= 9.1245;
double r= (f*b)+(i/c)-(d*s);
System.out.println((f*b)+" "+(i/c)+" "+(d*s));
System.out.println(r);




    }
}

