import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Neboola on 15.11.2015.
 */
public class SubStringSearch {
    public static void subStringSearch(String searchString){
        List<String> list = Arrays.asList("sdfasdfsa", "sdfasasdf", "asdfasdfa", "defasdfasdf", "dfaafaefaefae", "efasedfasdf", "asdfasdfas");
        List<String> tempList = new ArrayList<String>();
        for(String s : list){
            if(s.indexOf(searchString) != -1){
                tempList.add(s);
            }
        }
        for(String tempS : tempList){
            System.out.println(tempS);
        }
    }
}
