package Genericscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
public static String getdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException, InvalidFormatException{
	FileInputStream fis=new FileInputStream("./excel/testdata/sele.xlsx");
	Workbook book = WorkbookFactory.create(fis);
		
		Cell cl=book.getSheet(sheet).getRow(row).getCell(cell);
		 String value=cl.getStringCellValue();
		return value;
		
	}}