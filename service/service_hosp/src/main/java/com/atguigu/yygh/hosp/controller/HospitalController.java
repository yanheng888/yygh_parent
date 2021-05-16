package com.atguigu.yygh.hosp.controller;

import com.atguigu.yygh.common.result.Result;
import com.atguigu.yygh.hosp.service.HospitalService;
import com.atguigu.yygh.model.hosp.Hospital;
import com.atguigu.yygh.vo.hosp.HospitalQueryVo;
import com.atguigu.yygh.vo.hosp.HospitalSetQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/admin/hosp/hospital")
@CrossOrigin
@EnableSwagger2
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    //医院列表(条件查询分页)
    @GetMapping("list/{page}/{limit}")
    public Result listHosp(@PathVariable Integer page,
                           @PathVariable Integer limit,
                           HospitalQueryVo hospitalQueryVo) {
        Page pageModel = hospitalService.selectHospPage(page,limit,hospitalQueryVo);
        List<Hospital> content = pageModel.getContent();
        long totalElements = pageModel.getTotalElements();

        return Result.ok(pageModel);
    }
//    @ApiOperation(value = "查询医院列表")
//    @GetMapping("findHospList/{page}/{limit}")
//    public Result findHospList(@PathVariable Integer page,
//                               @PathVariable Integer limit,
//                               HospitalQueryVo hospitalQueryVo) {
//        Page<Hospital> hospitals = hospitalService.selectHospPage(page, limit, hospitalQueryVo);
//        return Result.ok(hospitals);
//    }
}
