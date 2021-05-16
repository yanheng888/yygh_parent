package com.atguigu.easyexcell;

import com.alibaba.excel.EasyExcel;

public class TestRead {
    public static void main(String[] args) {
        String path = "/Users/hengyan/Downloads/01.xlsx";
        EasyExcel.read(path,UserData.class,new ExcelListener()).sheet().doRead();
    }
}
