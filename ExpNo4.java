import java.util.*;

class Matrix
{
 int rows,cols;
 int ar[][];
 Scanner s=new Scanner(System.in);
 Matrix()
 {
  System.out.println("Enter the number of rows:");
  rows=s.nextInt();
  System.out.println("Enter the number of columns:");
  cols=s.nextInt();
  ar=new int[rows][cols];
 }
 
 Matrix(int r,int c)
 {
  rows=r;
  cols=c;
  ar=new int[rows][cols];
 }

 void getData()
 {
  System.out.println("Enter the matrix:");
   for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
      ar[i][j]=s.nextInt();}}
}

void display()
{
  for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
      System.out.print(ar[i][j]+"\t");}
     System.out.println("");
     }
}

void sum(Matrix m)
{
 if(rows==m.rows && cols==m.cols )
 {
  Matrix sum=new Matrix(m.rows,m.cols);
  for(int i=0;i<rows;i++){
   for(int j=0;j<cols;j++){
     sum.ar[i][j]=ar[i][j]+m.ar[i][j];
    }}
 sum.display();
 }
else
{
 System.out.println("unable to compute sum");
} 
}

 void product(Matrix m)
 {
  if (cols == m.rows)
  {
   Matrix product = new Matrix(rows, m.cols);
   for (int i = 0; i < rows; i++) {
    for (int j = 0; j < m.cols; j++) {
      int productSum = 0;
      for (int k = 0; k < cols; k++) {
        productSum += ar[i][k] * m.ar[k][j];
        }
           product.ar[i][j] = productSum;
        }
        }
        System.out.println("Product is:");
          product.display();  
      } 
      else 
          {
            System.out.println("unable to compute product");
        }
    }


}
class ExpNo4
{
 public static void main(String args[])
 {
  Matrix m=new Matrix();
  Matrix m1=new Matrix();
  m.getData();
  m1.getData();
  System.out.println("First Matrix:");
  m.display();
  System.out.println("Second Matrix:");
  m1.display();
  System.out.println("sum is:");
  m.sum(m1);
  m.product(m1);
 }

}
