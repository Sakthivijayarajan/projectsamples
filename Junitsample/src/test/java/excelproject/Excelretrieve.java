package excelproject;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelretrieve{
	
	public static String excelread1(int i,int j)
	{
		
		String Value = null;
		
		File f = new File(
				"C:\\Users\\vijay\\eclipse-workspace\\Junitsample\\src\\main\\resources\\data.xlsx");

		try {
			FileInputStream fis = new FileInputStream(f);
			
			Workbook Wb = new XSSFWorkbook(fis);
			org.apache.poi.ss.usermodel.Sheet sh = Wb.getSheet("sheet1");
			
			int noofrows= sh.getPhysicalNumberOfRows();
			
				Row row= sh.getRow(i);
			
				Cell cell = row.getCell(j);
				
				
				 Value= cell.getStringCellValue();
				 
				 
		
	
			

		}	
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Value;
		
		
		
	}
	
	
	
	

}

	
	
	
