package com.utils;

import com.domain.ContactPersonInfo;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WritePersonExcel {
    public static void write(List<ContactPersonInfo> contactPersonList, String path) throws IOException {
        //创建一个工作簿
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        //创建一个工作表
        XSSFSheet sheet=xssfWorkbook.createSheet("CustomerInfo");
        //创建行
        XSSFRow row=sheet.createRow(0);
        row.createCell(0).setCellValue("contactName");
        row.createCell(1).setCellValue("customerId");
        row.createCell(2).setCellValue("contactSex");
        row.createCell(3).setCellValue("contactBirthday");
        row.createCell(4).setCellValue("contactPost");
        row.createCell(5).setCellValue("contactOfficePhone");
        row.createCell(6).setCellValue("contactMobilePhone");
        row.createCell(7).setCellValue("contactEmail");
        row.createCell(8).setCellValue("contactRegistDate");
        row.createCell(9).setCellValue("contactQQNumber");
        row.createCell(10).setCellValue("contactRemarks");
        for (int i = 0; i < contactPersonList.size(); i++) {
            XSSFRow row1 = sheet.createRow(i + 1);
            row1.createCell(0).setCellValue(contactPersonList.get(i).getContactName());
            row1.createCell(1).setCellValue(contactPersonList.get(i).getCustomerId());
            row1.createCell(2).setCellValue(contactPersonList.get(i).getContactSex());
            row1.createCell(3).setCellValue(contactPersonList.get(i).getContactBirthday());
            row1.createCell(4).setCellValue(contactPersonList.get(i).getContactPost());
            row1.createCell(5).setCellValue(contactPersonList.get(i).getContactOfficePhone());
            row1.createCell(6).setCellValue(contactPersonList.get(i).getContactMobilePhone());
            row1.createCell(7).setCellValue(contactPersonList.get(i).getContactEmail());
            row1.createCell(8).setCellValue(contactPersonList.get(i).getContactRegistDate());
            row1.createCell(9).setCellValue(contactPersonList.get(i).getContactQQnumber());
            row1.createCell(10).setCellValue(contactPersonList.get(i).getContactRemarks());
        }
        if(path!=null) {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            xssfWorkbook.write(bufferedOutputStream);
            bufferedOutputStream.close();
            fileOutputStream.close();
        }


    }
}
