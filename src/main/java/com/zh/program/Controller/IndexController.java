package com.zh.program.Controller;

import com.alibaba.fastjson.JSONObject;
import com.zh.program.Common.enums.SysparamsKey;
import com.zh.program.Entrty.Banner;
import com.zh.program.Entrty.News;
import com.zh.program.Entrty.Sysparam;
import com.zh.program.Service.BannerService;
import com.zh.program.Service.NewsService;
import com.zh.program.Service.SysparamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @description: 首页
 * @author: zhaohe
 * @create: 2019-05-15 15:56
 */

@Controller
@RequestMapping(value = "index")
public class IndexController {
    @Autowired
    private BannerService bannerService;
    @Autowired
    private SysparamService sysparamService;
    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "")
    public String index(Model model){
        JSONObject jsonObject = sysparamService.getIndexSysparam();
        model.addAttribute("sysparam", jsonObject);
        List<Banner> bannerList = bannerService.findAll();
        model.addAttribute("banners", bannerList);
        List<News> newsList = newsService.getIndxList();
        model.addAttribute("newsList", newsList);
        return "index.html";
    }
}
