package Day2Part2.Day2P3;

public class Class1 implements MyInterface, MyInterface2{

    public static void main(String[] args) {
        Class1 c1 = new Class1();
        c1.display1();
        c1.display2();
        c1.display3();
    }

    @Override
    public void display1() {
        // TODO Auto-generated method stub
        System.out.println("From class 1");
    }

    @Override
    public void display2() {
        // TODO Auto-generated method stub
        System.out.println("From class 2");
    }

    @Override
    public void display3() {
        // TODO Auto-generated method stub
        System.out.println("From class 3");
    }

    @Override
    public void Omega() {
        // TODO Auto-generated method stub

    }
    
}
