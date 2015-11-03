import java.io.IOException;

/**
 * Created by Neboola on 03.11.2015.
 */
public class Experiments {

    public static void main(String[] args) throws IOException {

        Polimorf.test();

        sec(80);



    }

    public static void sec(int n){
        try {
            Thread.sleep(n*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
