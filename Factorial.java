import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
float a=s.nextInt();
float fact=1f;
for(float i=1f;i<=a;i++)
{
fact=fact*i;
}
System.out.println("Factorial of "+a+" is:"+fact);
}
}
