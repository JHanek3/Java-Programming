package Part9;


public class Main0000 {

    public static void main(String[] args) {
        // write your test code here
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        // Modify the classses so that B inherits class A and C inherits class B
        C C = new C();

        C.a();
        C.b();
        C.c();
        
    }
}

