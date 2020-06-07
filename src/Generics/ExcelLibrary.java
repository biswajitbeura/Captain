package Generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelLibrary implements AutoConstant
{

	public static String getCellValue(String path, String sheet, int row, int cell) throws IOException
	{
		FileInputStream Fis = new FileInputStream(Excelpath);
		XSSFWorkbook wb= new XSSFWorkbook(Fis);
		String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
		
		
	}
}
