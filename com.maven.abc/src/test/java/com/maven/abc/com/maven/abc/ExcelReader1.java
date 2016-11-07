package com.maven.abc.com.maven.abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {

static String projectPath=System.getProperty("user.dir");
	
	static FileInputStream inputStream=null;
	static Cell cell=null;
	static Workbook workbook=null;
	static Sheet sheet=null;
	
public static Hashtable<String,Object> readTCData(String testcaseID) throws IOException{

 
	
	String excelPath =projectPath+System.getProperty("file.separator")+"RunManager.xls";
    //	String excelPath=projectPath+"\\RunManager.xls";
		inputStream = new FileInputStream(new File(excelPath));
		workbook=new HSSFWorkbook(inputStream);
		sheet=workbook.getSheet("SampleApp");
		Row row=null;
		int lastrow=sheet.getLastRowNum();
		
		System.out.println("Last Row : "+lastrow);
		Hashtable<String,Object> ht=new Hashtable<String,Object>();
		
		for(int rowindex=1;rowindex<=lastrow;rowindex++){
			row=sheet.getRow(rowindex);
			int lastcol=row.getLastCellNum();
			System.out.println("Last Col : "+lastcol);
	
            if(getCellValue(row.getCell(0)).equals(testcaseID)){
				ht.put("tcid",getCellValue(row.getCell(0)));
				ht.put("tcdesc",getCellValue(row.getCell(1)));
				ht.put("tcmethod",getCellValue(row.getCell(2)));
				ht.put("tcexecute",getCellValue(row.getCell(3)));
				ht.put("username",getCellValue(row.getCell(4)));
				ht.put("password",getCellValue(row.getCell(5)));
				
			break;
			}
            
		}
		
	workbook.close();
	
return ht;
}


public static Object getCellValue(Cell c){
	Object val=null;
	switch(c.getCellType()){
	case Cell.CELL_TYPE_BOOLEAN: System.out.println("Cell is Boolean");
	val=c.getBooleanCellValue();
	break;
	case Cell.CELL_TYPE_NUMERIC : System.out.println("Cell is Numeric");
	String str = NumberToTextConverter.toText(c.getNumericCellValue());
	val=str;
	break;
	case Cell.CELL_TYPE_STRING: System.out.println("Cell is String");
	val=c.getStringCellValue();
	break;
	case Cell.CELL_TYPE_BLANK :System.out.println("Cell is Blank");
	val=null;
	break;
	}
	
	return val;
	
}
	
}
