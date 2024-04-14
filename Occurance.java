import java.util.*;
class Occurance
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the data:");
 String  data=s.next();
 System.out.print("Enter the character:");
 char c=s.next().charAt(0);
 int count=0;
 int len=data.length();
 for(int i=0;i<len;i++)
 {
  if(data.charAt(i)==c)
  {
   count++;
  }
 }
System.out.println("Count of "+c+" in "+data+" is:"+count);
}
}



