package io.excelFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
    String pathName = "data.xlsx";
    File file ;

    public Workbook isFileExist(){
        file = new File ( pathName );
        if( !file.exists ( ) ){
            createFile ( );
        }
        else System.out.println ("file exist" );
        return new XSSFWorkbook ( );
    }

    private void createFile() {
        Workbook wb = new XSSFWorkbook ( );
        Sheet sheet = wb.createSheet ( "Arkusz" );
        OutputStream fileOut = null;
        writeFile ( wb );
        System.out.println ( "Excel File has been created successfully." );
    }

    private void writeFile(Workbook wb) {
        OutputStream fileOut;
        try {
            fileOut = new FileOutputStream ( pathName );
            wb.write ( fileOut );
        } catch (FileNotFoundException e) {
            throw new RuntimeException ( e );
        } catch (IOException e) {
            throw new RuntimeException ( e );
        }
    }
}
