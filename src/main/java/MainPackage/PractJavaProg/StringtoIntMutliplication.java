package MainPackage.PractJavaProg;

import java.util.HashMap;

public class StringtoIntMutliplication
{


        public static void main(String [] args)
        {
            int a= 20;
            String s="ten";

            HashMap<String,Integer> wordToNumber= new HashMap<String,Integer>();
            wordToNumber.put("one",1);
            wordToNumber.put("two",2);
            wordToNumber.put("three",3);
            wordToNumber.put("ten",10);
            int i=wordToNumber.get(s.toLowerCase());
            System.out.println(i*a);
        }


}
