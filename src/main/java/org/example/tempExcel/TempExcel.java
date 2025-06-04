package org.example.tempExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class TempExcel {

    public static void main(String[] args) {
//        String filePath = "C:\\Users\\arjun\\Downloads\\student_records.xlsx";
//        D:\Firstbit Solutions\DSA\LinkedList\.
        ArrayList<String> mailList = new ArrayList<>();


        try (FileInputStream fis = new FileInputStream("student_records.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            //get the mail coloumn index
            Row header = sheet.getRow(0);

            int mailColIndex = -1;
            for (Cell cell:  header){
                if(cell.getStringCellValue().toLowerCase().contains("mail")){
                    mailColIndex = cell.getColumnIndex();
                    break;
                }
            }

            System.out.println("mail cell col index no " + mailColIndex);

            //priting all mail with col no 4
            for (int i = 1; i < sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
//                System.out.println(row.getCell(mailColIndex).getStringCellValue());
                mailList.add(row.getCell(mailColIndex).getStringCellValue());

            }


            System.out.println("printing mails");
            for (String mailId: mailList){
                System.out.println(mailId);
            }
//            for (Row row : sheet) {
//
//                for (Cell cell : row) {
//                    switch (cell.getCellType()) {
//                        case STRING:
//                            System.out.print(cell.getStringCellValue() + "\t");
//                            break;
//                        case NUMERIC:
//                            System.out.print(cell.getNumericCellValue() + "\t");
//                            break;
//                        default:
//                            System.out.print("UNKNOWN\t");
//                    }
//                }
//                System.out.println();
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
