package com.atguigu.yygh.hosp.controller.api;

import com.atguigu.yygh.common.helper.HttpRequestHelper;
import com.atguigu.yygh.common.result.Result;
import com.atguigu.yygh.hosp.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/api/hosp")
public class apiController {
//    @Autowired
//    private HospitalService hospitalService;
//
//    //上船医院接口
//    @PostMapping("saveHospital")
//    public Result saveHosp(HttpServletRequest request){
//        //获取传递过来医院信息
//        Map<String, String[]> requestMap = request.getParameterMap();
//        Map<String,Object> paramMap = HttpRequestHelper.switchMap(requestMap);
//        //调用service的方法
//        hospitalService.save(paramMap);
//        return Result.ok();
//    }
}
