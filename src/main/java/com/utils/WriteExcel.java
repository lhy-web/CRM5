package com.utils;

import com.domain.Customerinfo;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WriteExcel {
    public static void write(List<Customerinfo> customerList, String path) throws IOException {
        //创建一个工作簿
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        //创建一个工作表
        XSSFSheet sheet=xssfWorkbook.createSheet("CustomerInfo");
        //创建行
        XSSFRow row=sheet.createRow(0);
        row.createCell(0).setCellValue("customerName");
        row.createCell(1).setCellValue("customerProperties");
        row.createCell(2).setCellValue("customerType");
        row.createCell(3).setCellValue("customerLevel");
        row.createCell(4).setCellValue("customerCompanyWebsize");
        row.createCell(5).setCellValue("customerCompanyPhone");
        row.createCell(6).setCellValue("register");
        row.createCell(7).setCellValue("customerAddress");
        row.createCell(8).setCellValue("customerProvinces");
        row.createCell(9).setCellValue("customerCity");
        row.createCell(10).setCellValue("customerCode");
        row.createCell(11).setCellValue("openBank");
        row.createCell(12).setCellValue("bankAccount");
        row.createCell(13).setCellValue("customerSource");
        row.createCell(14).setCellValue("noteInformation");
        for (int i = 0; i < customerList.size(); i++) {
            XSSFRow row1 = sheet.createRow(i + 1);
            row1.createCell(0).setCellValue(customerList.get(i).getCustomerName());
            row1.createCell(1).setCellValue(customerList.get(i).getDictionaryTypeInfoByCustomerProperties().getDataInformationName());
            row1.createCell(2).setCellValue(customerList.get(i).getDictionaryTypeInfoByCustomerType().getDataInformationName());
            row1.createCell(3).setCellValue(customerList.get(i).getCustomerLevel().getLevelName());
            row1.createCell(4).setCellValue(customerList.get(i).getCustomerCompanyWebsize());
            row1.createCell(5).setCellValue(customerList.get(i).getCustomerCompanyPhone());
            row1.createCell(6).setCellValue(customerList.get(i).getRegister());
            row1.createCell(7).setCellValue(customerList.get(i).getCustomerAddress());
            row1.createCell(8).setCellValue(customerList.get(i).getCustomerProvinces());
            row1.createCell(9).setCellValue(customerList.get(i).getCustomerCity());
            row1.createCell(10).setCellValue(customerList.get(i).getCustomerCode());
            row1.createCell(11).setCellValue(customerList.get(i).getDictionaryTypeInfoByOpenBank().getDataInformationName());
            row1.createCell(12).setCellValue(customerList.get(i).getBankAccount());
            row1.createCell(13).setCellValue(customerList.get(i).getDictionaryTypeInfoByCustomerSource().getDataInformationName());
            row1.createCell(14).setCellValue(customerList.get(i).getNoteInformation());
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
