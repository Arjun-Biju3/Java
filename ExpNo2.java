class Complex {
 float real;
 float imaginary;
  Complex(float real, float imaginary) {
     this.real = real;
     this.imaginary = imaginary;
 }

 Complex add(Complex other) {
   float sumReal = this.real + other.real;
   float sumImaginary = this.imaginary + other.imaginary;
   return new Complex(sumReal, sumImaginary);
 }

 Complex subtract(Complex other) {
   float diffReal = this.real - other.real;
   float diffImaginary = this.imaginary - other.imaginary;
   return new Complex(diffReal, diffImaginary);
 }

  Complex multiply(Complex other) {
   float productReal = (this.real * other.real) - (this.imaginary * other.imaginary);
   float productImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
  return new Complex(productReal, productImaginary);
  }
 void display() {
    System.out.println(real + " + " + imaginary + "i");
 }
}
class ExpNo2
{

 public static void main(String arg[]) {
  Complex c1 = new Complex(2.0f, 3.0f);
  Complex c2 = new Complex(1.0f, 2.0f);

  System.out.println("Complex Number 1:");
  c1.display();

  System.out.println("Complex Number 2:");
  c2.display();

  Complex sum = c1.add(c2);
  System.out.println("\nSum of Complex Numbers:");
  sum.display();

  Complex diff = c1.subtract(c2);
  System.out.println("\nDifference of Complex Numbers:");
  diff.display();

  Complex product = c1.multiply(c2);
  System.out.println("\nProduct of Complex Numbers:");
  product.display();
    }
}
