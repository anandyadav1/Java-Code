package Oops;

class Shape {
    public void area() {
        System.out.println("Display area");
    }
}

class Trangle extends Shape {
    public void area(int length, int height) {
        System.out.println(0.5 * length * height);

    }
}

class EquilatralTrangle extends Shape {
    public void area(int length, int height) {
        System.out.println(0.5 * length * height);
    }
}

class Circle extends Shape {
    public void area(int r) { // r->Radius
        System.out.println(3.14 * r * r);
    }
}

public class Oops_java_1_2 {
    public static void main(String[] args) {
        Shape n = new Shape();
        n.area();
        Trangle t1 = new Trangle();
        t1.area(6, 8);

    }

}
