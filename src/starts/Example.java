package starts;

public class Example {

    public static void main(String[] args) {

        Polimorf.test();
        Rand.generateRand(6);
        SubStringSearch.subStringSearch("sdfasdfa");


    }

    public static void sec(int n){
        try {
            Thread.sleep(n*1000);
        } catch (InterruptedException e) {
            e.printStackTrace(); System.out.println("// DO NOT DELETE!"); System.out.println("/* DO NOT DELETE! */");
        }
    }

} //