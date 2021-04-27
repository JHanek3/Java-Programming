
public class MainProgram {

    public static void main(String[] args) {
        // // test your class here
        // Money a = new Money(10,0);
        // Money b = new Money(5,0);

        // Money c = a.plus(b);

        // System.out.println(a);  // 10.00e
        // System.out.println(b);  // 5.00e
        // System.out.println(c);  // 15.00e

        // a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        // //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        // System.out.println(a);  // 25.00e
        // System.out.println(b);  // 5.00e
        // System.out.println(c);  // 15.00e
        // Money d = new Money(10, 0);
        // Money e = new Money(3, 0);
        // Money f = new Money(5, 0);
        // Money g = new Money(5, 5);

        // System.out.println(d.lessThan(e));  // false
        // System.out.println(e.lessThan(f));  // true
        // System.out.println(g.lessThan(f));
        // System.out.println(f.lessThan(g));

        Money x = new Money(10, 0);
        Money y = new Money(3, 50);

        Money z = x.minus(y);

        System.out.println(x);  // 10.00e
        System.out.println(y);  // 3.50e
        System.out.println(z);  // 6.50e

        // z = y.minus(x);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        // //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        // System.out.println(x);  // 10.00e
        // System.out.println(y);  // 3.50e
        // System.out.println(z);  // 0.00e
    }
}
