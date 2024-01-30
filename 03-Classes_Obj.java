
import java.util.*;
import java.util.Scanner;
class A{
    public void fun(){
        System.out.println("Hello");
    }
}
class B extends A{
    public void fun2(){
        System.out.println("Bye bye");
    }
}
class hello{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        obj2.fun2();
        obj2.fun();
    }
}
