package demoPakage;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelFileRead
{
    public static void main(String [] args) throws IOException, InvalidFormatException {
        String filepath ="data/ExcelData.xlsx";
        File fs= new File(filepath);
        FileInputStream fis =new FileInputStream(fs);

        XSSFWorkbook xbook=new XSSFWorkbook(fis);
        XSSFSheet sheet= xbook.getSheetAt(0);
        Iterator<Row> rows= sheet.iterator();
        Row firstRow = rows.next();
        int column=0;
        int k=0;
       while(rows.hasNext())
       {
           Iterator<Cell> cellValue = firstRow.cellIterator();
         Cell cell =cellValue.next();
         if(cell.getCellType()== CellType.STRING)
         {
             if (cell.getStringCellValue().equalsIgnoreCase("TestCase"))
             {
                 column =k;
             }
         }
        k++;

       }
System.out.println(column);
    }
}
