package MainPackage.PractSeleniumProg;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter
{
    // @Test
//    public void streamFilter()
//    {
//        ArrayList<String> name = new ArrayList<String>();
//        name.add("Megha");
//        name.add("Amrut");
//        name.add("Sadhana");
//        name.add("Aniket");
//
//        Long c=name.stream().filter(s -> s.startsWith("A")).count();
//        System.out.println(c);
//        Long d= Stream.of("Ankit","Amruta","Megha","Amit","Anup","Janhavi","Ram","Akshay").filter(s -> s.startsWith("A")).count();
//        System.out.println(d);
//
//        Stream.of("Megha","Aditi","Neha").filter(s -> s.endsWith("a")).limit(1).forEach(s -> System.out.println(s));
//    }
//    @Test
//    public void streamMap()
//    {
//        Stream.of("Ankit","Amruta","Megha","Amit","Anup","Janhavi","Ram","Akshay").filter(s -> s.startsWith("A")).sorted().forEach(s -> System.out.println(s));
//        Stream.of("Ankit","Amruta","Megha","Amit","Anup","Janhavi","Ram","Akshay","Neha").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).sorted().forEach(s -> System.out.println(s));
//    }

    @Test
    public void streaConcat()
    {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Megha");
        name.add("Amrut");
       name.add("Sadhana");
        name.add("Aniket");
       List<String> str1 = Arrays.asList("Ankit","Amruta","Megha","Amit","Anup","Janhavi","Ram","Akshay");
       Stream<String> name2= Stream.concat(name.stream(),str1.stream());
      // name2.forEach(s -> System.out.println(s));
       boolean result =name.stream().anyMatch(s -> s.equalsIgnoreCase("Megha"));
        Assert.assertTrue(result);
       List<String> s1= str1.stream().filter(s -> s.startsWith("A")).distinct().collect(Collectors.toList());
        System.out.println(s1.get(0));
         }


//    public static void main(String [] args)
//    {
//        //MainPackage.StreamFilter SF= new MainPackage.StreamFilter();
//       // SF.streamFilter();
//        ArrayList<String> name = new ArrayList<String>();
//        name.add("Megha");
//        name.add("Amrut");
//        name.add("Sadhana");
//        name.add("Aniket");
//        int count=0;
//        for(String s:name)
//        {
//            if(s.startsWith("A"))
//            {
//                count ++;
//
//            }
//        }
//        System.out.println(count);
//
//    }

}
