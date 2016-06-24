package lambdas.chapter2;

import javax.swing.*;
import java.util.function.Predicate;

public class Examples {

    public static void main(String[] args) {
        Runnable helloWorld = () -> System.out.println("hello world");

        JButton button = new JButton();
        button.addActionListener(event ->
                System.out.println(event.getActionCommand()));

        check(x -> x > 5);
    }

    static boolean check(Predicate<Integer> predicate) {
        return true;
    }
//    static boolean check(IntPred predicate) {
//        return true;
//    }
}
