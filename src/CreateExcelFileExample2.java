import java.io.*;  
public class CreateExcelFileExample2  
{  
public static void main(String[]args)   
{  
try   
{  
String filename = "C:\\Users\\68928\\Desktop\\Detalles.xlsx";  

FileOutputStream fileOut = new FileOutputStream(filename);  
fileOut.close();  
System.out.println("Archivo Excell ha sido creado exitosamente.");  
}   
catch (Exception e)   
{  
e.printStackTrace();  
}  
}  
}  