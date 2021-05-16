package com.atguigu.easyexcell;

import com.alibaba.excel.EasyExcel;
import com.atguigu.yygh.model.acl.User;

import java.util.ArrayList;

public class TestWrite {
    public static void main(String[] args) {
        String path = "/Users/hengyan/Downloads/01.xlsx";
        ArrayList<UserData> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            UserData userData = new UserData();
            userData.setId(i);
            userData.setName("lucy" + i);
            arr.add(userData);
        }
        EasyExcel.write(path,UserData.class).sheet("用户信息").doWrite(arr);
    }
}
