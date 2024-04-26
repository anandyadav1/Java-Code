package Oops;

class Pen{
    String colour;
    String type;
 
    public void write(){
        System.out.println("Hii Anand");

    }

    public void printcolour(){
        System.out.println(this.colour);
    }
    
    public void printtype(){
        System.out.println(this.type);
        System.out.println();
    }

   Pen(){         //Type 1 Constructeer

       System.out.println("Information of Pen");
    }
}


class Student{
    String name;
    int age;

    public void printInformation(){
        System.out.println("Age=" +this.age);
        System.out.println("Name="+this.name);
    }
    Student(){
        // System.out.println("Constructer called");
        System.out.println("Information of Student");
    }

    Student(String name, int age){     //Type 2 Constructer
        this.name=name;
        this.age=age;
    }
    
}


// Polymorphism
class Students{
    String name;
    int age;

   public void Information(String name){
    System.out.println(name);
   }
   
   public void Information(int age){
    System.out.println(age);
   }

   public void Information(String name , int age){
    System.out.println(name+ "" +age);
   }
    
}
public class Oops_java_1_ {
    public static void main(String[] args) {
        // System.out.println("Hii Anand");
        Pen Pen1=new Pen();
         Pen1.colour="Red";
         Pen1.type="Gail";
         Pen1.write();
         Pen1.printcolour();
         Pen Pen2=new Pen();
         Pen2.colour="Black";
         Pen2.printcolour();
         Pen1.printtype();


         //Student s1=new Student();
         //s1.age=18;
         //s1.name="Anand Kumar Yadav";
         //s1.printInformation();
         Student s1=new Student("Anand", 18);
         s1.printInformation();

         Students s2=new Students();
         s2.name="Anand Kumar Yadav";
         s2.age=18;
         System.out.println();
         s2.Information( s2.name, s2.age);

    }
}
