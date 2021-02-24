package Day2Part2;

public class ProjectRun2 
{
    public static void main(String[] args) {
        
        Shape Ann = new Annette(); 
        Ann.makeCoffee();
        Ann.method1();
        

        Albert al = new Albert();
        al.method1();
        al.makeCoffee();
        al.makeTea();

    }
}
