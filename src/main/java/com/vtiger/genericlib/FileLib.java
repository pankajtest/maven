package com.vtiger.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



	public class FileLib {
		/**
		 * It is used to read the data from CommonData.properties file 
		 *@param Key 
		 *@return String value 
		 * @throws Throwable 
		 *@throws Throwable
		 */
		public String getPropertyData(String Key) throws Throwable
		{
			//Step 1: Create a java Representation object of the physical file
					FileInputStream fis= new FileInputStream("C:\\Users\\Pankaj\\Desktop\\CommonData.properties");
			       //Create an object to properties to load all the data
					Properties pobj= new Properties();
					pobj.load(fis);
					//Using Key read the Value
					String value=pobj.getProperty(Key);
			 		return value;
			}
		/**
		 * It is used to read data from Excel workbook .xlsx file
		 * @param sheetname
		 * @param rownum
		 * @param cellnuml
		 * @return
		 * @throws throwable
		 */
		public String getExcelTestData (String sheetname, int rownum, int cellnum) throws Throwable {

		       FileInputStream fis= new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Book1.xlsx");
		       //Step:1 Open Workbook In Read Mode
		       Workbook wb=  WorkbookFactory.create(fis);
		       //Step:2 Get the Control of the sheet1
		       Sheet sh=wb.getSheet("Sheetname");
		       //Step:3 Get Control of the Row1
		        Row row=sh.getRow(rownum);
		        //Get the Control of the Second Cell in 1 Row & Read the Data
		        String cellvalue=row.getCell(cellnum).getStringCellValue();
		        System.out.println(cellvalue);
		        //LogOut
		        wb.close();
		        return cellvalue; 
		} 
		/**
		 * It is used to transfer data back to Excel Workbook .xlsx file from Script
		 * @param 
		 * @param sheetname
		 * @param rownum
		 * @param cellnuml
		 * @return
		 * @throws Throwable 
		 * @throws throwable
		 */
		public void transferDataToExcel(String sheetname, int rownum, int cellnum ,String data) throws Throwable {
		
		   FileInputStream fis= new FileInputStream("C:\\Users\\Pankaj\\Desktop\\Book1.xlsx");
	       //Step:1 Open Workbook In Read Mode
	       Workbook wb=  WorkbookFactory.create(fis);
	       //Step:2 Get the Control of the sheet1
	       Sheet sh=wb.getSheet("Sheetname");
	       //Step:3 Get Control of the Row1
	        Row row=sh.getRow(rownum);
	        //Get the Control of the Second Cell in 1 Row & Read the Data
	        row.createCell(cellnum).setCellValue(data);
	        FileOutputStream fos= new FileOutputStream("C:\\Users\\Pankaj\\Desktop\\CommonData.properties");
	        wb.write(fos);
	        wb.close();

}
	}
