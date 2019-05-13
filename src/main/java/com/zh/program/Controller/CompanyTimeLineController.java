package com.zh.program.Controller;

import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.Banner;
import com.zh.program.Entrty.CompanyTimeline;
import com.zh.program.Service.BannerService;
import com.zh.program.Service.CompanyTimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
*@Description: 发展历史管理
*@Param:
*@return:
*@Author: zhaohe
*@date: 2019-05-13
*/
@Controller
@RequestMapping(value = "timeLine")
public class CompanyTimeLineController {
    @Autowired
    private CompanyTimelineService companyTimelineService;

    @ResponseBody
    @GetMapping("list")
    public String get(){
        List<CompanyTimeline> list = companyTimelineService.selectAll(new HashMap<>());
        return Result.toResult(ResultCode.SUCCESS, list);
    }

}
