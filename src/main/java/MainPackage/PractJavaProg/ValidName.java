package MainPackage.PractJavaProg;

import java.util.HashSet;
import java.util.Scanner;

public class ValidName
{

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Strings : ");
        HashSet<String> studentNM = new HashSet<>();
        for (int i=0; i<3; i++)
        {
            String name =sc.next();
            if(!(studentNM.contains(name)))
            {
                studentNM.add(name);

            }
            else
            {
                System.out.println("String is Invalid /Duplicate ");
            }

        }

              //Iterator<String> it = studentNM.iterator();
           for(String s : studentNM)
            {
                boolean valid = true;

                char [] ch =s.toCharArray();
                for(char c : ch) {
                    if ((Character.isAlphabetic(c) || Character.isDigit(c))) {
                        valid = true;
                    }
                    else {
                        valid = false;
                        System.out.println("String is Invalid "+s);
                        break;
                    }
                }

                if (valid)
                    System.out.println("String is Valid "+s);
            }

        }



    }



