package BasicPract;

import Files.PayLoad;
import io.restassured.path.json.JsonPath;

import static org.testng.Assert.assertEquals;

public class ComplexJsonParse
{
    public static void main(String [] args)
    {

        //1. Print No of courses returned by API

        JsonPath js= new JsonPath(PayLoad.CoursePrice());
        int size = js.getInt("courses.size()");
        System.out.println("Total Number Courses :"+size);

        //2.Print Purchase Amount
        int cousesAmt = js.getInt("dashboard.purchaseAmount");
        System.out.println("Purchase Amount:"+cousesAmt);

        //3. Print Title of the first course
        System.out.println(js.getString("courses[0].title"));

        //4. Print All course titles and their respective Prices
        System.out.println("Print All course titles and their respective Prices");
         for(int i=0; i<size; i++)
         {
             System.out.println(js.getString("courses["+i+"].title"));
             System.out.println(js.getString("courses["+i+"].price"));

         }

         //5. Print no of copies sold by RPA Course
          for(int i=0; i<size; i++)
          {
              String courseTitel =js.getString("courses["+i+"].title");
              if(courseTitel.equalsIgnoreCase("RPA"))
              {
                  System.out.println("Price of RPA course :"+js.getString("courses["+i+"].price"));
                  break;
              }

          }

          //6. Verify if Sum of all Course prices matches with Purchase Amount


        System.out.println("Total Number Courses :"+size);
          int total =0;
        for(int i=0; i<size; i++)
        {
            int price = js.getInt("courses["+i+"].price");
            int copies =js.getInt("courses["+i+"].copies");

          total = total + price* copies ;
        }

        assertEquals(total,cousesAmt);






    }
}
