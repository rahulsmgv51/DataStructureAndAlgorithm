package Opps.ClassAndObject;

class Box {
    private int length, breadth, height; // These are called instance member variables
    public void setDimension(int l, int b, int h){ //Instance member function
        length = l;
        breadth = b;
        height = h;
    }
    public void showDimension(){  //Instance member function
        System.out.println("L = "+ length);
        System.out.println("B = "+ breadth);
        System.out.println("H = "+ height);
    }
}
class Main{
    public static void main(String[] args) {
        Box smallBox = new Box();
        smallBox.setDimension(1, 2, 3);
        smallBox.showDimension();
        smallBox = new Box(); // After Creating new reference older object had assign grbage value
        smallBox.showDimension(); // This instance store 0 value at all place because we not assign further its value
    }
}