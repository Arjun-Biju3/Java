import java.util.*;
class SumOfNatural
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the value:");
 int val=s.nextInt();
 int sum=0;
 for(int i=1;i<=val;i++)
 {
   sum=sum+i;
 }
System.out.println("Sum of first "+val+" natural numbers is:"+sum);
}
}
