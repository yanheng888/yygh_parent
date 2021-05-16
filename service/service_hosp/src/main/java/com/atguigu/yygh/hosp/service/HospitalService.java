package com.atguigu.yygh.hosp.service;

import com.atguigu.yygh.model.hosp.Hospital;
import com.atguigu.yygh.vo.hosp.HospitalQueryVo;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Map;


public interface HospitalService {
    void save(Map<String, Object> paramMap);

    //医院列表（条件查询分页）
    Page<Hospital> selectHospPage(Integer page, Integer limit, HospitalQueryVo hospitalQueryVo);
}
