import java.util.*;
class SumOfDigit
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the value:");
 int num=s.nextInt();
 int temp=num;
 int sum=0;
 int digit;
 while(num !=0)
 {
  digit=num%10;
  sum=sum+digit;
  num=num/10;
 }
System.out.println("Sum of digits of "+temp+" is:"+sum);
}
}




