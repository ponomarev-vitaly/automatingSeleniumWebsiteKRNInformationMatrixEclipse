import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.openxml4j.exceptions.InvalidFormatException;

public class ExcelLibrary {
    public String getExcelData(String filePath, String sheetName, int rowNum, int cellNum) throws IOException, InvalidFormatException {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\vvp\\Desktop\\ExcelLibrary.xlsx");
             Workbook wb = WorkbookFactory.create(fis)) {
            Sheet sheet = wb.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(cellNum);
            return cell.getStringCellValue();
        }
    }
    
    public int getLastRowNumber(String filePath, String sheetName) throws IOException, InvalidFormatException {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\vvp\\Desktop\\ExcelLibrary.xlsx");
             Workbook wb = WorkbookFactory.create(fis)) {
            Sheet sheet = wb.getSheet(sheetName);
            return sheet.getLastRowNum();
        }
    }
    
    public static void main(String[] args) {
        // Your testing code here
    }
}
