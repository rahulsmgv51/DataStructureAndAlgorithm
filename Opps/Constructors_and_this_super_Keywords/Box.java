package Opps.Constructors_and_this_super_Keywords;

class GiftTaker{
    public void acceptGift(Box box){
        System.out.println("Gift is recieved "+ box.b*box.l*box.h);
    }
}

public class Box {
    int l,b,h;

    // public Box(int l, int b, int h) {
        //l = l; name collision occured
        // b = b;
        //h = h; 
    // }
    public Box(int x, int y, int z){ 
        this.l = x; //this represent the caller object
        this.b = y;
        this.h = z;
    }

    // Method needs to pass the current object to another method, it can do so using the this reference.
    public void sendBox(){
        GiftTaker gt = new GiftTaker();
        gt.acceptGift(this); // We send the current object to acceptGift method. and every time create when method call and every time end when program end .
    }

    public static void main(String[] args) {
        Box b1 = new Box(36, 18, 29);
        System.out.println("Volume : "+b1.l*b1.b*b1.h +" cube");
        b1.sendBox();
    }
}
