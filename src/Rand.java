import java.util.Random;

/**
 * Created by Neboola on 03.11.2015.
 */
public class Rand {

    public static void generateRand(int n){
        for (int i = 0; i < n; i++) {
            Random r = new Random();
            System.out.println("Random " + r.nextInt(n));

        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int ri = (int)(Math.random() * n);
            System.out.println("Math.random " + ri);
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            Random r = new Random();
            System.out.println("Random " + r.nextInt(n));
            int ri = (int)(Math.random() * n);
            System.out.println("Math.random " + ri);
        }
        System.out.println();


    }
}
