import java.util.*;
class StringArray
{
 String strs[];
 int count;
 StringArray(String str[],int n)
 {
  strs=new String[n];
  strs=str;
  count=str.length;
 
 }
 
 int search(String ss)
 {
  for(int i=0;i<count;i++)
  { 
   if(strs[i].equals(ss))
   {
    return i;
   }
  
  }
 return -1;
 }

void display() {
  for (int i = 0; i < strs.length; i++) {
   System.out.print(strs[i] + " ");
   }
   System.out.println();
  }
void sort() {
  int n = strs.length;
   String temp;
   for (int i = 0; i < n - 1; i++) {
   for (int j = 0; j < n - i - 1; j++) {
   if (strs[j].compareTo(strs[j + 1]) > 0) {
      temp = strs[j];
      strs[j] = strs[j + 1];
      strs[j + 1] = temp;
     }
    }
   }
 }

}

class ExpNo6
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int n,res;
  String s1[];
  System.out.println("Enter the number of strings:");
  n=s.nextInt();
  s1=new String[n];
  System.out.println("Enter the string:");
  for(int i=0;i<n;i++)
  {
   s1[i]=s.next();
  }

 StringArray sa=new StringArray(s1,n);
  System.out.println("Strins are:");
  sa.display();
  System.out.println("Sorted strings are:");
 sa.sort();
 sa.display();
 System.out.println("enter the search key:");
 String key=s.next();
 res=sa.search(key);
 if(res>-1)
 {
  System.out.println("Element found at position"+" "+ (res+1));
 }
 else
 {
  System.out.println("Element not found");
 }
 }
}
