import java.util.*;
class Vehicle
{
Scanner s=new Scanner(System.in);
String maker;
String model;

void displayInfo()
{

}
class Insurance
{
    int p_no;
    int amount; 
    Insurance(Car c1)
    {
      maker=c1.maker;
      model=c1.model;
    }
    Insurance(MotorCycle m1)
    {
      maker=m1.maker;
      model=m1.model;
    }
    void set_data()
    {
        System.out.println("Enter policy number:");
        p_no=s.nextInt();
        System.out.println("Enter amount:");
        amount=s.nextInt();
    }
    void display()
    {
        System.out.println("Maker:"+maker);
        System.out.println("Model:"+model);
        System.out.println("Amount:"+amount);
        System.out.println("policy number:"+p_no);
    }
}

}
class Car extends Vehicle
{
    

    void get_data()
    {
        System.out.println("Enter Maker:");
        maker=s.next();
        System.out.println("Model:");
        model=s.next();
    }
     void displayInfo()
    {
        System.out.println("TYPE:CAR");
        System.out.println("Maker:"+maker);
        System.out.println("Model:"+model);
    }

}

class MotorCycle extends Vehicle
{
    

    void get_data()
    {
        System.out.println("Enter Maker:");
        maker=s.next();
        System.out.println("Model:");
        model=s.next();
    }
     void displayInfo()
    {
        System.out.println("TYPE:MOTORCYCLE");
        System.out.println("Maker:"+maker);
        System.out.println("Model:"+model);
    }

}
class Exam
{
    public static void main(String args[])
    {
        Car c1=new Car();
        c1.get_data();
        System.out.println("Vehicle details:");
        c1.displayInfo();
        Vehicle v1=new Vehicle();
        Vehicle.Insurance ins=v1.new Insurance(c1);
        ins.set_data();
        System.out.println("Insurance details:");
        ins.display();
        MotorCycle m1=new MotorCycle();
        m1.get_data();
        System.out.println("Vehicle details:");
        m1.displayInfo();
        Vehicle v2=new Vehicle();
        Vehicle.Insurance ins2=v2.new Insurance(m1);
        ins2.set_data();
        System.out.println("Insurance details:");
        ins2.display();

    }
}

