package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private static XSSFWorkbook workbook;
	public ExcelReader(String path) {
		File f=new File(path);
		
		 try {
			 FileInputStream fis=new FileInputStream(f);
			workbook=new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static String captureCellValue(int sheetindex,int row,int cell) {
	return 	workbook.getSheetAt(sheetindex).getRow(row).getCell(cell).getStringCellValue();
	}
	public static int countRow(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getLastRowNum()+1;
	}
	public static int countCell(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}
	
	public Object[][] getData(String path,int sheetindex){
		int row=countRow(sheetindex);
		int cell=countCell(sheetindex);
		Object [][]arr=new String[row][cell];
		for(int i=0;i<row;i++) {
			for(int j=0;j<cell;j++) {
				arr[i][j]=captureCellValue(sheetindex,i,j);
			}
		}
		return arr;
	}

}
