package demoPakage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDuplicatesRemove
{
    public static void main(String [] args)
    {

        ArrayList<Integer> list=new ArrayList();
        list.add(89);
        list.add(19);
        list.add(20);
        list.add(19);
        list.add(20);
        list.add(21);

      //  List<Integer> unique_list=list.stream().distinct().sorted().collect(Collectors.toList());
List<Integer> unique_list=list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("ArryList After removing duplicates :"+unique_list);

    }
}
