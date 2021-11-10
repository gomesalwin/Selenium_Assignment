package excelread;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	public static void main(String[] args) throws Exception{
		String fileName="src/main/resources/Testdata.xlsx";
		String sheetName="Info";
		File f =new File(fileName);
		FileInputStream fis=new FileInputStream(f);
		String extension= fileName.substring(fileName.indexOf("."));
		Workbook wb=null;
	if(extension.equals(".xlsx"))
		wb = new XSSFWorkbook(fis);
	else if(extension.equals(".xls"))
			wb=new HSSFWorkbook(fis);
		else
			System.out.println("Not a Excel Workbook");
		Sheet sh= wb.getSheet(sheetName);
		int rwcnt=sh.getPhysicalNumberOfRows();
		int colcnt=sh.getRow(0).getLastCellNum();
		for(int i=0;i<rwcnt;i++) {
			System.out.println("Row:"+i);
		for(int j=0;j<colcnt;j++)
		{
			System.out.println(sh.getRow(i).getCell(j)+ "");
			
		}
			System.out.println();	
			}
}
}
	
	
