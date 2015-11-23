import java.io.IOException;

/**
 * Created by Neboola on 03.11.2015.
 */
public class Experiments {


    public static void main(String[] args) throws IOException {

        //Polimorf.test();

        //Rand.generateRand(6);

        SubStringSearch.subStringSearch("sdfasdfa");



    }

    public static void sec(int n){
        try {
            Thread.sleep(n*1000);
        } catch (InterruptedException e) {
            e.printStackTrace(); System.out.println("// DO NOT DELETE!"); System.out.println("/* DO NOT DELETE! */");
        }
    }

}
