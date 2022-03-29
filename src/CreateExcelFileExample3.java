import  java.io.*;  
import  org.apache.poi.hssf.usermodel.HSSFSheet;  
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import  org.apache.poi.hssf.usermodel.HSSFRow;  
public class CreateExcelFileExample3  
{  
public static void main(String[]args)   
{  
try   
{  
//declare file name to be create   
	String filename = "C:\\Users\\68928\\Desktop\\HEXAWARE_EMPLEADOS.xls";  
//creating an instance of HSSFWorkbook class  
HSSFWorkbook workbook = new HSSFWorkbook();  
//invoking creatSheet() method and passing the name of the sheet to be created   
HSSFSheet sheet = workbook.createSheet("March");   
//creating the 0th row using the createRow() method  
HSSFRow rowhead = sheet.createRow((short)0);  
//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
rowhead.createCell(0).setCellValue("NAME");  
rowhead.createCell(1).setCellValue("LASTNAME");  
rowhead.createCell(2).setCellValue("EMAIL");  
rowhead.createCell(3).setCellValue("PASSWORD");  
rowhead.createCell(4).setCellValue("COMPANY");
rowhead.createCell(5).setCellValue("ADDRESS");  
rowhead.createCell(6).setCellValue("CITY");  
rowhead.createCell(7).setCellValue("ZIP_CODE");  
rowhead.createCell(8).setCellValue("MOBILE_PHONE");  
//creating the 1st row  
HSSFRow row = sheet.createRow((short)1);  
//inserting data in the first row  
row.createCell(0).setCellValue("Uxman");  
row.createCell(1).setCellValue("Sagno");  
row.createCell(2).setCellValue("UxmanS@hexaware.com");  
row.createCell(3).setCellValue("Uxmasag9");  
row.createCell(4).setCellValue("Hexaware");
row.createCell(5).setCellValue("De la fuente #1061");  
row.createCell(6).setCellValue("Saltillo");  
row.createCell(7).setCellValue("25000");  
row.createCell(8).setCellValue("8445525538");  

//inserting data in the second row  
row.createCell(0).setCellValue("Rasheed");  
row.createCell(1).setCellValue("Ramirez");  
row.createCell(2).setCellValue("RasheedR@hexaware.com");  
row.createCell(3).setCellValue("Rashram9");  
row.createCell(4).setCellValue("Hexaware");
row.createCell(5).setCellValue("De la fuente #1061");  
row.createCell(6).setCellValue("Saltillo");  
row.createCell(7).setCellValue("25600");  
row.createCell(8).setCellValue("8445678901");  
FileOutputStream fileOut = new FileOutputStream(filename);  
workbook.write(fileOut);  
//closing the Stream  
fileOut.close();  
//closing the workbook  
workbook.close();  
//prints the message on the console  
System.out.println("El Archivo Excell ha Sido Creado Exitosamentet.");  
}   
catch (Exception e)   
{  
e.printStackTrace();  
}  
}  
}  