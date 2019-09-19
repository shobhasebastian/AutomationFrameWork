package com.wbl.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {
 public static long PAGE_LOAD_TIMEOUT=20;
 public static long IMPLICIT_WAIT=10;
 public static String TESTDATA_SHEET_PATH="C:/Users/dell/eclipse-workspace/TestAutomationFrameworkJuly/src/main/java/com/wbl/qa/testdata/Uid.xlsx";
 static Workbook book;
 static Sheet sheet;

public static Object[][] getTestData(String SheetName){
	FileInputStream file=null;
	try {
		file=new FileInputStream(TESTDATA_SHEET_PATH);
		
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}
	try {
		book=WorkbookFactory.create(file);
	} catch(IOException e) {
		e.printStackTrace();
	}
	sheet=book.getSheet(SheetName);
	Object[][]data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

  for(int i=0;i<getLastRowNum();i++) {
	  for(int k=0;k<getRow(0).getLastCellNum();k++) {
		data[i][k] =sheet.getRow(i+1).getCell(k).toString();
	  }
  }
return data;

}

private static Row getRow(int i) {
	// TODO Auto-generated method stub
	return null;
}

private static int getLastRowNum() {
	// TODO Auto-generated method stub
	return 0;
}
}
