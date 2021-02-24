package Day2Part2;

public abstract class Shape 
{
    public void method1() //non abstract, can be used by any derived classes
    {

        System.out.println("Both: I am making drinks");

    }

    abstract void makeCoffee();//abstract
    abstract void makeTea();

}
