import Folder1.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Test2 {
    public static void main(String[] args) 
    {
        

        //Scanner

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        //String name = input.next();//Anila Joy = Display = Anila
        String name1 = input.nextLine();// Anila Joy = Display = Anila Joy
        //int num = input.nextInt();
        //System.out.println("Your entry is: " + name);
        System.out.println("Your entry is: " + name1);

        input.close();
/*
        System.out.println("Done");
        
        F1Test1 p1t1 = new F1Test1();
        P2Test1 f1t1 = new P2Test1();
        f1t1.display1();
        int result = f1t1.display1();
        System.out.println("The result is "+ result);

        List<String> ls = new ArrayList<String>();
        ls.add("Apple");
        ls.add("Kiwi");
        ls.add("Banana");
        
        //foreach
        //for (String fruits : ls) {
        //    System.out.println(fruits);
        //}

        //Iterator
        //Iterator it = ls.iterator();
        //while(it.hasNext())
        //System.out.println("Fruit: " + it.next());

        ListIterator it = ls.listIterator();
        System.out.println("Forward");
        while (it.hasNext())
        System.out.println("Fruit: "+ it.next());//forward
        System.out.println("Backward: ");
        while(it.hasPrevious())
        System.out.println("Fruit rev.: " + it.previous()); //backward
        */
        }
    }

