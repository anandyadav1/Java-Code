
class Employee {
    int salary;
    String name;

    public int getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public void setname(String n) {
        this.name = n;
    }
}

public class Oops2 {
    public static void main(String[] args) {
        Employee anand = new Employee();
        anand.setname("Anandkumaryadav"); // Corrected method name to setname
        anand.salary = 565;
        System.out.println(anand.getName());
        System.out.println(anand.getName());
        System.out.println(anand.getSalary());
        System.out.println(anand.getSalary());
        System.out.println(anand.getSalary());
        System.out.println(anand.getSalary());
        System.out.println(anand.getSalary());
    }
}
