package BasicPract;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;

import org.testng.Assert;

import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;

import Files.PayLoad;



public class BasicPostRequest
{
    public static void main(String [] args) throws IOException {
        //Validate that Add place API is working fine
        //given -all input details
        //when -submit the api
        //then- verify the response

        RestAssured.baseURI="https://rahulshettyacademy.com";
        String path ="C:\\Megha\\API_Testing_Projects\\Rest_Assured\\API_Project\\src\\test\\Resources\\AddPlacePayload.json";
      String response=  given().queryParam("key","qaclick123").header("context.type","application.json").body(PayLoad.addPlace())
                .when().post("/maps/api/place/add/json").then().assertThat().statusCode(200).body("scope",equalTo("APP"))
                .header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();

        System.out.println(response);
        JsonPath jp = new JsonPath(response);
       String placeid= jp.getString("place_id");
        System.out.println(placeid);

        //Update Place
        String newAddress = "Summer Walk, Africa";

        given().queryParam("key","qaclick123").header("context-type","application.json").body("{\n" +
                "\"place_id\":\""+placeid+"\",\n" +
                "\"address\":\""+newAddress+"\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}").when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));

        //Get Place
         String getResponse =given().queryParam("key", "qaclick123").queryParam("place_id",placeid).when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().response().asString();

         JsonPath jp1 = new JsonPath(getResponse);
         String actualAddress =jp1.getString("address");
        Assert.assertEquals(actualAddress, newAddress);

        //addPlace through file
        String rp=  given().queryParam("key","qaclick123").header("context.type","application.json").body(PayLoad.addPlace())
                .when().post(generateStringFromFiles(path)).then().assertThat().statusCode(200).extract().response().asString();


    }
    public static String generateStringFromFiles(String p) throws IOException
    {
        return new String(Files.readAllBytes(Paths.get(p)));
    }
}
