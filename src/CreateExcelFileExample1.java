import java.io.*;   
import org.apache.poi.hssf.usermodel.HSSFWorkbook;   
import org.apache.poi.ss.usermodel.Workbook;   
public class CreateExcelFileExample1   
{   
private static Workbook wb;

public static void main(String[] args) throws FileNotFoundException, IOException   
{   
wb = new HSSFWorkbook();   
//creates an excel file at the specified location  
OutputStream fileOut = new FileOutputStream("C:\\demo\\Prueba.xlsx");   
System.out.println("Archivo Excell ha sido creado.");   
wb.write(fileOut);   
}   
}  