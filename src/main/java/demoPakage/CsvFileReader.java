package demoPakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader
{

    public static void main(String [] args) throws IOException {
        String filePath="data/FilpcartURLs.csv";
       // System.setProperty("webdriver.chrome.driver","");
        WebDriver driver =new ChromeDriver();

        BufferedReader br =new BufferedReader(new FileReader(filePath));
        String line;
        String csvSplit=",";
        line =br.readLine();
        while(line!= null)
        {
            String a[] = line.split(csvSplit);
            for(String i :a)
            {
              if(i.contains("http"))
              {
                  driver.get(i);
              }

            }
            line =br.readLine();
        }




    }

}
