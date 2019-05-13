package com.zh.program.Controller;

import com.alibaba.fastjson.JSONObject;
import com.zh.program.Common.authorization.annotation.Decrypt;
import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.Banner;
import com.zh.program.Entrty.User;
import com.zh.program.Service.BannerService;
import com.zh.program.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*@Description: Banner管理
*@Param:
*@return:
*@Author: zhaohe
*@date: 2019-05-13
*/
@Controller
@RequestMapping(value = "banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @ResponseBody
    @GetMapping("list")
    public String get(){
        List<Banner> list = bannerService.findAll();
        return Result.toResult(ResultCode.SUCCESS, list);
    }

}
