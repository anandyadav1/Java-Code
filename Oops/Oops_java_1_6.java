package Oops;

class Myself {
    String intero;

    public void Information() {
        System.out.println(
                "I am Anand kumar yadav from B.Teach Student of computer science and engineering.\nI belong to the Jaunpur.\nCurrently Pursuing Software Engineering from Mathura.");
    }

    Myself() {
        System.out.println("Self interro :\n");

    }

}

class Bank {
    String bankname;
    long accNumber;
    String custmername;
    String email;
    int ammount;
    float ammounts;
    private String Password;

    public void Bankname(String n) {
        System.out.println(this.bankname = n);

    }

    public long AccNumber() {
        return this.accNumber;
    }

    public void AccountHolder(String name) {
        System.out.println(this.custmername = name);

    }

    public void Email(String email) {
        System.out.println(this.email = email);
    }

    public void Ammount(int n) {
        System.out.println(this.ammount = n);
    }

    public void Ammounts(float n) {
        System.out.println(this.ammounts = n);
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String pass) {
        System.out.println(Password = pass);
    }

    Bank() {
        System.out.println("Details of Bank :\n");

    }
}

class School {
    String collegename;
    int rollnumber;
    int age;
    String friend;
    String teacher;
    int year;

    public void Collegename(String name) {
        System.out.println(this.collegename = name);
    }

    public void Rollnumber(int n) {
        System.out.println(this.rollnumber = n);
    }

    public void Age(int a) {
        System.out.println(this.age = a);
    }

    public void Friend(String name) {
        System.out.println(this.friend = name);
    }

    public void Teacher(String name) {
        System.out.println(this.teacher = name);
    }

    public void Year(int year) {
        System.out.println(this.year = year);
    }

    School() {
        System.out.println("Information og School :\n");
    }

}

class College {
    String clgname;
    String course;
    String branch;
    String year;
    String name;
    int age;
    long rollnumber;
    String email;
    double mbnumber;
    private String password;

    public void Collegename(String n) {
        System.out.println(this.clgname = n);
    }

    public void Course(String n) {
        System.out.println(this.course = n);
    }

    public void Branch(String n) {
        System.out.println(this.branch = n);
    }

    public void Year(String ye) {
        System.out.println(this.year = ye);
    }

    public void Name(String n) {
        System.out.println(this.name = n);
    }

    public void Age(int a) {
        System.out.println(this.age = a);
    }

    public void Rollnumber(long r) {
        System.out.println(this.rollnumber = r);
    }

    public void Email(String e) {
        System.out.println(this.email = e);
    }

    public void MobilNumber(double mb) {
        System.out.println(this.mbnumber = mb);
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        System.out.println(this.password = pass);
    }

    College() {
        System.out.println("Details of College :\n");
    }

}

public class Oops_java_1_6 {
    public static void main(String[] args) {

        Myself msf = new Myself();
        msf.Information();

        System.out.println("\n");
        Bank b1 = new Bank();
        System.out.println("Bank Name :- " + " ");
        b1.Bankname("Punjab National Bank ");
        System.out.println("Account Number :- " + " ");
        b1.accNumber = 1477100100003969L;
        System.out.println(b1.AccNumber());
        System.out.println("Custmer Name :- " + " ");
        b1.AccountHolder("Anand Kumar Yadav ");
        System.out.println("E-mail :-" + " ");
        b1.Email("ay4799958@gmail.com ");
        System.out.println("Total Ammount :- " + " ");
        b1.Ammount(2300 + 564);
        // b1.Ammounts(2300.7778F);
        System.out.println("Password :- " + " ");
        b1.setPassword("anand@12345\n");
        b1.getPassword();

        System.out.println("\n");
        School sc = new School();
        System.out.println("Coolege Name :- ");
        sc.Collegename("SHRI GIRAJA SHARAN INTER COLLEGE MORAKHA DOBHI JAUNPUR ");
        System.out.println("Rollnumber :- ");
        sc.Rollnumber(2285300);
        System.out.println("Age :-");
        sc.Age(16);
        System.out.println("Lngotiya yar :-");
        sc.Friend("Nilesh Kumar Yadav");
        System.out.println("My best teacher :-");
        sc.Teacher("Raghuvendra Sir ");
        System.out.println(("Year pass out :-"));
        sc.Year(2020);

        System.out.println("\n");
        College cl = new College();
        System.out.println("College name :-");
        cl.Collegename("G L Bajaj Group Of Institutions, Mathura ");
        System.out.println("Course :-");
        cl.Course("B.Teach");
        System.out.println("Branch :-");
        cl.Branch("Computer Science and Engineering ");
        System.out.println("Year :-");
        cl.Year("Secondyear in this college :");
        System.out.println("Name :-");
        cl.Name("Anand Kumar Yadav ");
        System.out.println("Age :-");
        cl.Age(18);
        System.out.println("Rollnumber :-");
        cl.Rollnumber(2205110100025L);
        System.out.println("E-mail :-");
        cl.Email("anand.yadav2022@glbajajgroup.org");
        System.out.println("Mobile number :-");
        cl.MobilNumber(9565314380D);
        System.out.println("AkTU Password :-");
        cl.setPassword("anand@12345");
        System.out.println(cl.getPassword());

    }
}

