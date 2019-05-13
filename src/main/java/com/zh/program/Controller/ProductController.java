package com.zh.program.Controller;

import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.Banner;
import com.zh.program.Entrty.Product;
import com.zh.program.Entrty.ProductArticle;
import com.zh.program.Service.BannerService;
import com.zh.program.Service.ProductArticleService;
import com.zh.program.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*@Description: 产品管理
*@Param:
*@return:
*@Author: zhaohe
*@date: 2019-05-13
*/
@Controller
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductArticleService productArticleService;

    /**
    *@Description: 获取产品列表
    *@Param: [type] 0产品介绍 1产品特性 2应用案例
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
        List<Product> list = productService.selectAll(map);
        return Result.toResult(ResultCode.SUCCESS, list);
    }

    /**
     * 根据产品列表ID查找文章
     * @param id
     * @return
     */
    @ResponseBody
    @GetMapping("getArticleById")
    public String getById(Integer id){
        if(id == null){
            return Result.toResult(ResultCode.PARAM_IS_BLANK);
        }
        ProductArticle productArticle = productArticleService.selectByArticleId(id);
        if(productArticle == null){
            return Result.toResult(ResultCode.RESULE_DATA_NONE);
        }
        return Result.toResult(ResultCode.SUCCESS, productArticle);
    }


}
