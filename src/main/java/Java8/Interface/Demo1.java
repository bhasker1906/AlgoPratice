package Java8.Interface;

public class Demo1 {

    public static void main(String[] args){
        System.out.println("Welcome Java8");
        Demo1 obj=new Demo1();
        obj=null;
        System.gc();
        Singleton x = Singleton.getInstance();

        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // changing variable of instance x
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // changing variable of instance z
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method");
        super.finalize();
    }
}
