package Inheritance;


// Java program to illustrate the
// concept of Multiple inheritance
import java.io.*;
        import java.lang.*;
        import java.util.*;



        interface One1 {
    public void print_geek();
}

interface Two2 {
    public void print_for();
}

interface Three3 extends One1, Two2 {
    public void print_geek();
}
class Child1 implements Three3 {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }

    public void print_for() { System.out.println("for"); }
}

// Drived class
public class MultipleInheritance {
    public static void main(String[] args)
    {
        Child1 c = new Child1();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
