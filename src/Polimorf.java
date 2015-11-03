/**
 * Created by Neboola on 03.11.2015.
 */
public class Polimorf {

    public static void test(){
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        System.out.println("t1 = " + t1.i + " t2 = " + t2.i);
        t2.i = 2;
        System.out.println("t1 = " + t1.i + " t2 = " + t2.i);
        t1.i = 1;
        System.out.println("t1 = " + t1.i + " t2 = " + t2.i);
        t1 = t2;
        System.out.println("t1 = " + t1.i + " t2 = " + t2.i);
        System.out.println("t1 = " + t1.getI() + " t2 = " + t2.getI());
    }
}
