 package Oops;
 
 interface Animal {
    int eyes =2;
    void walk();
}

 interface Herbivore{

    
}


class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
}
}

public class Oops_java_1_5 {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
    }
}
