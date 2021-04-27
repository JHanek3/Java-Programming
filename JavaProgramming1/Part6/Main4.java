
public class Main4 {

    public static void main(String[] args) {

        SimpleCollection s = new SimpleCollection("characters");
        System.out.println(s);

        System.out.println();

        s.add("magneto");
        System.out.println(s);

        System.out.println();

        s.add("mystique");
        System.out.println(s);

        System.out.println();

        s.add("phoenix");
        System.out.println(s);
        
        SimpleCollection t = new SimpleCollection("test");
        System.out.println(t);
        
    }
}
