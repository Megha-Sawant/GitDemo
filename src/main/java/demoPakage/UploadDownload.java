package demoPakage;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class UploadDownload
{
    public FileInputStream fis;
   public XSSFWorkbook wb;
   public XSSFSheet sheet;
    public XSSFRow ro;
    public static void main(String[] args) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-web-security");
        WebDriver driver = new ChromeDriver(options);
        UploadDownload up =new UploadDownload();

        //WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        String fruitName = "Apple";
        String updatedValue = "603";
        String filePath ="C:\\Megha\\My_First_Project\\data\\download.xlsx";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        int row =up.getRowNo(filePath,"Apple");
        int col = up.getColumnNo(filePath,"price");
        Assert.assertTrue(up.updateCell(filePath,row,col,updatedValue));
        driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
        WebElement upload = driver.findElement(By.cssSelector("input[id='fileinput']"));
        upload.sendKeys("C:\\Megha\\My_First_Project\\data\\download.xlsx");
        By element=By.cssSelector("div[role='alert'] div:nth-child(2)");
        wait.until(ExpectedConditions.visibilityOfElementLocated (element));
        String msg =driver.findElement(element).getText();
        Assert.assertEquals(msg ,"Updated Excel Data Successfully.");
        wait.until(ExpectedConditions.invisibilityOfElementLocated (element));
        List<WebElement> price= driver.findElements(By.cssSelector("div[data-column-id='4']"));
        List<WebElement> fruitNM= driver.findElements(By.cssSelector("div[data-column-id='2']"));
        for (int i=2; i< fruitNM.size();i++)
        {


                if(fruitNM.get(i).getText().equalsIgnoreCase(fruitName))
                {
                    System.out.println(price.get(i).getText());
                }

        }
        System.out.println(row);
        System.out.println(col);
        driver.close();

    }

    public boolean updateCell(String filePath, int row, int col, String updatedValue) throws IOException {
        fis =new FileInputStream(filePath);
        wb = new XSSFWorkbook(fis);
        sheet =wb.getSheetAt(0);
        Row rowField =sheet.getRow(row);
        Cell cellField = rowField.getCell(col);
        cellField.setCellValue(updatedValue);
        FileOutputStream fos = new FileOutputStream(filePath);
        wb.write(fos);
        wb.close();
        fis.close();
        return true;

    }

    public int getRowNo(String filePath, String fruitName) throws IOException {
        fis =new FileInputStream(filePath);
        int rowNo=0;
        wb = new XSSFWorkbook(fis);
        sheet =wb.getSheetAt(0);
      //  DataFormatter formatter = new DataFormatter();

        Iterator<Row> rows= sheet.iterator();

      int i=0;

      while(rows.hasNext()) {
          Row row= rows.next();
          Iterator<Cell> cells=row.cellIterator();

          while (cells.hasNext())
          {
              Cell value = cells.next();
             // String val =formatter.formatCellValue(value);

              if (value.getCellType()== CellType.STRING && value.getStringCellValue().equalsIgnoreCase(fruitName))
              {
                  rowNo = i;

              }



          }
          i++;
      }


        return rowNo;
    }

    public  int getColumnNo(String filePath, String price) throws IOException {
        fis =new FileInputStream(filePath);
        int colNo=0;
        wb = new XSSFWorkbook(fis);
        sheet =wb.getSheetAt(0);
        DataFormatter formatter = new DataFormatter();
        Iterator<Row> rows= sheet.iterator();

        int i=0;


            Row row= rows.next();
            Iterator<Cell> cells=row.cellIterator();

            while (cells.hasNext())
            {
                Cell value = cells.next();
                String val =formatter.formatCellValue(value);

                if (val.equalsIgnoreCase(price))
                {
                    colNo = i;

                }

            i++;
        }


        return colNo;
    }


}
