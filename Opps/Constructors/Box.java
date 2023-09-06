package Opps.Constructors;

public class Box {
    int l,b,h;

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public static void main(String[] args) {
        Box b1 = new Box(36, 18, 29);
        System.out.println("Volume : "+b1.l*b1.b*b1.h +" cube");
    }
}
