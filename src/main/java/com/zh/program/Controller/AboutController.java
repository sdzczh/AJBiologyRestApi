package com.zh.program.Controller;

import com.alibaba.fastjson.JSONObject;
import com.zh.program.Entrty.CompanyHonor;
import com.zh.program.Entrty.CompanyTimeline;
import com.zh.program.Entrty.Sysparam;
import com.zh.program.Service.CompanyHonorService;
import com.zh.program.Service.CompanyTimelineService;
import com.zh.program.Service.SysparamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 关于页
 * @author: zhaohe
 * @create: 2019-05-16 10:25
 */
@Controller
@RequestMapping("about")
public class AboutController {
    @Autowired
    private SysparamService sysparamService;
    @Autowired
    private CompanyTimelineService companyTimelineService;
    @Autowired
    private CompanyHonorService companyHonorService;

    /**
     * 关于页首页
     * @param model
     * @return
     */
    @RequestMapping(value = "")
    public String index(Model model){
        JSONObject jsonObject = sysparamService.getAboutSysparam();
        model.addAttribute("sysparam", jsonObject);
        Map<Object, Object> map = new HashMap<>();
        List<CompanyTimeline> companyTimelines = companyTimelineService.selectAll(map);
        List<CompanyHonor> companyHonors = companyHonorService.selectAll(map);
        model.addAttribute("companyTimelines", companyTimelines);
        model.addAttribute("companyTimelines", companyHonors);
        return "about.html";
    }

    /**
     * 公司简介
     * @param model
     * @return
     */
    @RequestMapping(value = "companyInfo")
    public String companyInfo(Model model){


        return "companyInfo.html";
    }
}
