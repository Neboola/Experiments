import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Neboola on 03.12.2015.
 */
public class CompareSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(44);
        list.add(4);
        list.add(6);
        list.add(-3);
        list.add(4);
        list.add(0);
        for (int i : list) {
            System.out.println(i);
        }
        System.out.println("===Quick===");

        List<Integer> listQ = new ArrayList<Integer>();
        listQ.addAll(list);

        for (int i : list) {
            System.out.println(i);
        }
        System.out.println();

        listQ = qSort(list);

        for (int i : listQ) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("===Comparator===");


/*        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
*/        //System.out.println();

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i : list) {
            System.out.println(i);
        }
        System.out.println();

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i : list) {
            System.out.println(i);
        }
        System.out.println();




    }

    public static List<Integer> qSort(List<Integer> input) {

        if (input.size() == 0) return Collections.EMPTY_LIST;
        Integer head = input.get(0);
        input.remove(0);
        ArrayList<Integer> rigt = new ArrayList<Integer>(input.size() / 2);
        ArrayList<Integer> left = new ArrayList<Integer>(input.size() / 2);

        for (Integer element : input) {
            if (element > head) rigt.add(element);
            else left.add(element);
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        result.addAll(qSort(left));
        result.add(head);
        result.addAll(qSort(rigt));

        return result;
    }


}
