
public class Main {

    public static void main(String[] args) {
    //     // test your program here!
    //     SimpleDate test1 = new SimpleDate(1, 1, 1);
    //     System.out.println(test1);
    //     test1.advance();
    //     System.out.println(test1);
    //     // System.out.println(test1);
    //     // SimpleDate test2 = new SimpleDate(29, 1, 1);
    //     // System.out.println(test2);
    //     // test2.advance();
    //     // System.out.println(test2);
    //     // test2.advance();
    //     // System.out.println(test2);
    //     // SimpleDate test3 = new SimpleDate(30, 11, 1);
    //     // System.out.println(test3);
    //     // test3.advance();
    //     // System.out.println(test3);
    //     // SimpleDate test4 = new SimpleDate(30, 12, 1);
    //     // System.out.println(test4);
    //     // test4.advance();
    //     // System.out.println(test4);
    //     // SimpleDate test1 = new SimpleDate(1, 1, 1);
    //     // System.out.println(test1);
    //     // test1.advance(5);
    //     // System.out.println(test1);
    //     SimpleDate test2 = new SimpleDate(25, 1, 1);
    //     System.out.println(test2);
    //     test2.advance(5);
    //     System.out.println(test2);
    //     test2.advance(5);
    //     System.out.println(test2);
    //     SimpleDate test3 = new SimpleDate(25, 12, 1);
    //     test3.advance(5);
    //     System.out.println(test3);
    //     test3.advance(5);
    //     System.out.println(test3);
    SimpleDate date = new SimpleDate(13, 2, 2015);
    System.out.println("Friday of the examined week is " + date);

    SimpleDate newDate = date.afterNumberOfDays(7);
    int week = 1;
    while (week <= 7) {
        System.out.println("Friday after " + week + " weeks is " + newDate);
        newDate = newDate.afterNumberOfDays(7);

        week = week + 1;
    }


    System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
    //    System.out.println("Try " + date.afterNumberOfDays(790));
    }
}
