import java.util.*;
class Positive
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter value to check:");
int val=s.nextInt();
if(val>0)
System.out.println("Entered number is positive");
else if(val<0)
System.out.println("Entered number is negative");
else
System.out.println("Entered number is zero");
}
}
