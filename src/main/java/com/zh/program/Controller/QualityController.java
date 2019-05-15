package com.zh.program.Controller;

import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.Product;
import com.zh.program.Entrty.ProductArticle;
import com.zh.program.Entrty.Quality;
import com.zh.program.Service.ProductArticleService;
import com.zh.program.Service.ProductService;
import com.zh.program.Service.QualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*@Description: 质量管理
*@Param:
*@return:
*@Author: zhaohe
*@date: 2019-05-13
*/
@Controller
@RequestMapping(value = "quality")
public class QualityController {
    @Autowired
    private QualityService qualityService; 

    /**
    *@Description: 获取质量列表内容
    *@Param: [type] 0原料基地 1质量控制 2质量认证
    *@return: java.lang.String
    *@Author: zhaohe
    *@date: 2019-05-13
    */
    @ResponseBody
    @GetMapping("list")
    public String get(Integer type){
        if(type == null){
            return Result.toResult(ResultCode.PARAM_IS_BLANK);
        }
        Map<Object, Object> map = new HashMap<>();
        map.put("type", type);
        List<Quality> list = qualityService.selectAll(map);
        return Result.toResult(ResultCode.SUCCESS, list);
    }

}
