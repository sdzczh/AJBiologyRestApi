package com.zh.program.Controller;

import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.Banner;
import com.zh.program.Entrty.CompanyHonor;
import com.zh.program.Service.BannerService;
import com.zh.program.Service.CompanyHonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*@Description: 荣誉称号管理
*@Param:
*@return:
*@Author: zhaohe
*@date: 2019-05-13
*/
@Controller
@RequestMapping(value = "honor")
public class CompanyHonorController {
    @Autowired
    private CompanyHonorService companyHonorService;

    @ResponseBody
    @GetMapping("list")
    public String get(){
        Map<Object, Object> map = new HashMap<>();
        List<CompanyHonor> list = companyHonorService.selectAll(map);
        return Result.toResult(ResultCode.SUCCESS, list);
    }

}
