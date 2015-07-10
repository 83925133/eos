package com.whale.eos.basic.util.excel;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * Created with IntelliJ IDEA.
 * User: swen
 * Date: 13-11-20
 * Time: 下午3:59
 * To change this template use File | Settings | File Templates.
 */
public class ExcelWriter {
    /**
     * @param response
     * @param fileName  文件名
     * @param sheetName 页面名称（目前只支持一页）
     * @param dataList  数据集合
     * @throws IOException
     */
    public static void export(HttpServletResponse response, String fileName, String sheetName, String[] title, List<List<String>> dataList)
            throws IOException {
        // 设置response方式,使执行此controller时候自动出现下载页面,而非直接使用excel打开
        response.setContentType("APPLICATION/OCTET-STREAM");

        response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));

        export(response.getOutputStream(), sheetName,title, dataList);
    }

    /**
     * 目前仅支持第一列合并
     * @param response
     * @param fileName  文件名
     * @param sheetName 页面名称（目前只支持一页）
     * @param dataList  数据集合
     * @throws IOException
     */
    public static void exportWithMergedRegion(HttpServletResponse response, String fileName, String sheetName
            , String[] title, List<List<String[]>> dataList)
            throws IOException {
        // 设置response方式,使执行此controller时候自动出现下载页面,而非直接使用excel打开
        response.setContentType("APPLICATION/OCTET-STREAM");

        response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));

        exportWithMergedRegion(response.getOutputStream(), sheetName, title, dataList);
    }

    private static void export(OutputStream outputStream, String sheetName, String[] title, List<List<String>> dataList)
            throws IOException {
        HSSFWorkbook workBook = new HSSFWorkbook();
        HSSFSheet sheet = workBook.createSheet(sheetName);

        HSSFRow row0 = sheet.createRow(0);
        int length = title.length;
        for (int i = 0; i < length; i++) {
            row0.createCell(i).setCellValue(title[i]);
        }

        int rowNum = 1;

        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            List<String> rowData = dataList.get(i);
            HSSFRow row = sheet.createRow(rowNum);
            int size1 = rowData.size();
            for (int j = 0; j < size1; j++) {
                String s = rowData.get(j);
                row.createCell(j).setCellValue(s);
            }
            rowNum++;
        }

        sheet.setGridsPrinted(true);

        workBook.write(outputStream);

    }

    private static void exportWithMergedRegion(OutputStream outputStream, String sheetName, String[] title, List<List<String[]>> dataList)
            throws IOException {
        HSSFWorkbook workBook = new HSSFWorkbook();
        HSSFSheet sheet = workBook.createSheet(sheetName);

        HSSFRow row0 = sheet.createRow(0);
        for (int i = 0; i < title.length; i++) {
            row0.createCell(i).setCellValue(title[i]);
        }

        int rowNum = 1;
        for (int i = 0; i < dataList.size(); i++) {
            List<String[]> rowData = dataList.get(i);

            for (int j = 0; j < rowData.size(); j++) {
                HSSFRow row = sheet.createRow(rowNum);
                String[] s = rowData.get(j);
                for (int k = 0; k < s.length; k++) {
                    String s1 = s[k];
                    row.createCell(k).setCellValue(s1);
                }
                rowNum++;
            }
            if (rowData.size() > 1) {

                //合并一个单元格,下面用图解释
                sheet.addMergedRegion(new CellRangeAddress(
                        rowNum - rowData.size(), //first row (0-based)
                        rowNum - 1, //last row  (0-based)
                        0, //first column (0-based)
                        0  //last column  (0-based)
                ));
            }
        }

        sheet.setGridsPrinted(true);

        workBook.write(outputStream);

    }
}
