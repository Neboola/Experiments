/**
 * Created by Neboola on 03.12.2015.
 */
public class CauseLevels
{
    public static void main(String[] args)
    {
        try {
            m2();
        } catch (Ex3 e) {
            e.printStackTrace();
        }
    }
    static void m1() throws Ex2 {
        try {
            throw new Ex1();
        } catch (Ex1 e) {
            throw new Ex2(e);
        }
    }
    static void m2() throws Ex3 {
    try {
        m1();
    } catch (Ex2 e) {
        throw new Ex3(e);
    }
    }

    static class Ex1 extends Exception {}
    static class Ex2 extends Exception {
        public Ex2(Ex1 e) {
            super(e);
        }
    }
    static class Ex3 extends Exception {
        public Ex3(Ex2 e) {
            super(e);
        }
    }
}
